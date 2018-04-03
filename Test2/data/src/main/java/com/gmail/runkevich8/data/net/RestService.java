package com.gmail.runkevich8.data.net;


import com.gmail.runkevich8.data.entity.Data;
import com.gmail.runkevich8.data.entity.Image;
import com.gmail.runkevich8.data.entity.User;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

@Singleton
public class RestService {

    private RestApi restApi;

    @Inject
    public RestService(RestApi restApi) {
        this.restApi = restApi;
    }

    public Observable<List<User>> loadUsers() {
        return restApi
                .loadUsers();
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
}
