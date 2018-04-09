package com.gmail.runkevich8.data.net;


import com.gmail.runkevich8.data.entity.Error;
import com.gmail.runkevich8.data.entity.ErrorType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.SocketException;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import retrofit2.HttpException;


@Singleton
public class ErrorTransformers {

    private Gson gson;

    @Inject
    public ErrorTransformers(Gson gson) {
        this.gson = gson;
    }

    public <Model, errorThrowаble extends Error> ObservableTransformer<Model, Model> parseHttpError() {

        return new ObservableTransformer<Model, Model>(){

            @Override
            public ObservableSource<Model> apply(Observable<Model> upstream) {
                return   upstream.onErrorResumeNext(new Function<Throwable, ObservableSource<? extends Model>>() {
                    @Override
                    public ObservableSource<? extends Model> apply(Throwable throwable) throws Exception {
                        if (throwable instanceof SocketException) {

                            return Observable.error(new Error(ErrorType.SERVER_NOT_AVALIBLE));//сори,подожди пять минут,пока сервер нежоступен
                        } else if (throwable instanceof IOException) {

                            return Observable.error(new Error(ErrorType.NO_INTERNET));

                        } else if (throwable instanceof HttpException) {

                            HttpException httpException = (HttpException) throwable;
                            String bodyError = (String) httpException.response().body();

                            //такая же функция в парсинге json(нельзя в скобках записать User.class - для типизации errorThrowаble)
                            Type errorType = new TypeToken<errorThrowаble>(){}.getType();
                            errorThrowаble throawble = gson.fromJson(bodyError, errorType);

                            return Observable.error(new Error(ErrorType.SERVER_ERROR));

                        } else {

                            return Observable.error(new Error(ErrorType.UNKNOWN));

                        }

                    }
                });
            }
        };
    }
}
