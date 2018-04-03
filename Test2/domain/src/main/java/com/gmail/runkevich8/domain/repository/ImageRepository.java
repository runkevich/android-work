package com.gmail.runkevich8.domain.repository;


import com.gmail.runkevich8.domain.entity.ImageEntity;

import java.util.List;

import io.reactivex.Observable;

public interface ImageRepository {

    Observable<List<ImageEntity>> search(String search);
    Observable<List<ImageEntity>> trending();
}
