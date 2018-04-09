package com.gmail.runkevich8.domain.repository;


import com.gmail.runkevich8.domain.entity.UserEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;



public interface UserRepository {

    Observable<UserEntity> get (String id);

    Observable<List<UserEntity>> getList();



    Completable save(UserEntity entity);

    Completable addUser(UserEntity entity);

    Completable remove(String id);

}
