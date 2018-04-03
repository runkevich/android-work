package com.runkevich8.gmail.injection;


import android.arch.persistence.room.Room;
import android.content.Context;

import com.gmail.runkevich8.data.database.AppDatabase;
import com.gmail.runkevich8.data.net.RestApi;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.data.repository.UserRepositoryImpl;
import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.repository.UserRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.runkevich8.gmail.executor.UIThread;
import com.runkevich8.gmail.test.BuildConfig;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {
    //Модуль - это класс, который предоставляет реализацию зависимостей

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context getContext(){
        return context;
    }

    @Provides
    @Singleton
    public PostExecutionThread getUiThread(){ //1 способ (1=2 - значение одно и то же)
        return new UIThread();
    }

//    2 способ
//    @Binds
//    public abstract PostExecutionThread getUiThread(UIThread uiThread);


    @Provides
    @Singleton
    public AppDatabase getAppDatabase(Context context) {

        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class,
                "database")
                .fallbackToDestructiveMigration()
                .build();

        return appDatabase;
    }
    @Provides
    @Singleton
    public UserRepository getUserRepository(Context context,
                                            RestService restService){
        return new UserRepositoryImpl(context,restService);
    }
//______________________________________
    @Provides
    @Singleton
    public Retrofit getRetrofit(OkHttpClient okHttpClient,Gson gson){

        return  new Retrofit.Builder()
                .baseUrl(BuildConfig.MY_CLOUD_API)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

    }

    @Provides
    @Singleton
    public OkHttpClient getOkHttpClient(){

        //тоже самое ,что и httpUrlConnection в джаве

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10,TimeUnit.SECONDS);



         //между получение и отправкой можно модифицировать код

        if(BuildConfig.DEBUG){

            HttpLoggingInterceptor httpLoggingInterceptor =
                    new  HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor .Level.BODY);

         builder.addInterceptor(httpLoggingInterceptor);

        }
       return builder.build();
    }


    @Provides
    @Singleton
    public RestApi getRestApi(Retrofit retrofit){

        return retrofit.create(RestApi.class);
    }
//_________________________________________________
    @Provides
    @Singleton
    public Gson getGson(){
        return new GsonBuilder()
                //в этом промежутке можно еще разные методы писать например GsonBuilderData
                .create();
    }

}
