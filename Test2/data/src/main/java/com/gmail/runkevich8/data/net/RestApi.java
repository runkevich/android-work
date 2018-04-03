package com.gmail.runkevich8.data.net;



import com.gmail.runkevich8.data.entity.Data;
import com.gmail.runkevich8.data.entity.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApi {

    @GET("data/User")
    Observable<List<User>> loadUsers();

    @GET("data/User/{id}")
    Observable<User> loadUserById(@Path("id") String id);

    @GET("v1/gifs/search")
    @Headers("api_key: " + Constants.API_IMAGE_KEY)
    Observable<Data> searchImages(@Query("q") String search);

    @GET("v1/gifs/trending")
    @Headers("api_key: " + Constants.API_IMAGE_KEY)
    Observable<Data> trendingImages();

}
