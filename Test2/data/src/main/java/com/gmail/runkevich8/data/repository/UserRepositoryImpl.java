package com.gmail.runkevich8.data.repository;


import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.repository.UserRepository;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class UserRepositoryImpl implements UserRepository{


    @Override
    public Observable<UserEntity> get(String id) {

        return   Observable.create(new ObservableOnSubscribe<UserEntity>() {
            @Override
           public void subscribe(ObservableEmitter<UserEntity> emitter) throws Exception {
                Thread.sleep(2000);
                UserEntity entity =
                        new UserEntity("Katya Runkevich",22,
                                "http://www.freeiconspng.com/uploads/spongebob-and-patrick-png-6.png",true);
                emitter.onNext(entity);//переекинь данне какие-то в UI поток
                emitter.onComplete();//закончили с этими данными

            }
        });
    }

    @Override
    public Observable<List<UserEntity>> get() {
       // return Observable.just(new ArrayList<UserEntity>());
        return  null;
    }

    @Override
    public Completable save() {
        return null;
    }

    @Override
    public Completable remove() {
        return null;
    }
}
