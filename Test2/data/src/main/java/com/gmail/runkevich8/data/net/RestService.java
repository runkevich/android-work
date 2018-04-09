package com.gmail.runkevich8.data.net;


import com.gmail.runkevich8.data.entity.Data;
import com.gmail.runkevich8.data.entity.Error;
import com.gmail.runkevich8.data.entity.Image;
import com.gmail.runkevich8.data.entity.User;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

@Singleton
public class RestService {

    private RestApi restApi;
    private ErrorTransformers errorTransformers;

    @Inject
    public RestService(RestApi restApi, ErrorTransformers errorTransformers) {
        this.restApi = restApi;
        this.errorTransformers = errorTransformers;
    }

    public Observable<List<User>> loadUsers() {
        return restApi
                .loadUsers()
                .compose(errorTransformers.<List<User>, Error>parseHttpError());
    }




    public Observable<User> loadUserById(String id) {
        return restApi.loadUserById(id);
    }

    public Observable<List<Image>> searchImages(String search) {
        return restApi
                .searchImages(search)
                .map(new Function<Data, List<Image>>() {
                    @Override
                    public List<Image> apply(Data data) throws Exception {
                        return data.getData();
                    }
                });
    }

    public Observable<List<Image>> trendingImages() {
        return restApi
                .trendingImages()
                .map(new Function<Data, List<Image>>() {
                    @Override
                    public List<Image> apply(Data data) throws Exception {
                        return data.getData();
                    }
                });
    }


    public Completable save(User user) {
        return restApi.save(user);
    }

    public Completable addNewUser(User user) {
        return restApi.addUser(user);
    }

    public Completable remove(String id) {
        return restApi.removeUser(id);
    }
}
