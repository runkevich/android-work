package com.gmail.runkevich8.data.repository;


import com.gmail.runkevich8.data.entity.Image;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.domain.entity.ImageEntity;
import com.gmail.runkevich8.domain.repository.ImageRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class ImageRepositoryImpl implements ImageRepository {

    private RestService restService;

    public ImageRepositoryImpl(RestService restService) {
        this.restService = restService;
    }

    @Override
    public Observable<List<ImageEntity>> search(String search) {
        return restService
                .searchImages(search)
                .map(new Function<List<Image>, List<ImageEntity>>() {
                    @Override
                    public List<ImageEntity> apply(List<Image> images) throws Exception {
                        List<ImageEntity> list = new ArrayList<>();
                        for(Image image: images) {
                            list.add(new ImageEntity(image.getUrl()));
                        }

                        return list;
                    }
                });
    }

    @Override
    public Observable<List<ImageEntity>> trending() {
        return restService
                .trendingImages()
                .map(new Function<List<Image>, List<ImageEntity>>() {
                    @Override
                    public List<ImageEntity> apply(List<Image> images) throws Exception {
                        List<ImageEntity> list = new ArrayList<>();
                        for(Image image: images) {
                            list.add(new ImageEntity(image.getUrl()));
                        }

                        return list;
                    }
                });
    }
}
