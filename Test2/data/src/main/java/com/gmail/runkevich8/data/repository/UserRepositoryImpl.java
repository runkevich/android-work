package com.gmail.runkevich8.data.repository;


import android.content.Context;

import com.gmail.runkevich8.data.entity.User;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.domain.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class UserRepositoryImpl implements UserRepository{

    private Context context;
    private RestService restService;

    public UserRepositoryImpl(Context context, RestService restService) {
        this.context = context;
        this.restService = restService;
    }

    @Override
    public Observable<com.gmail.runkevich8.domain.entity.UserEntity> get(String id) {

//
//        return   Observable.create(new ObservableOnSubscribe<User>() {
//            @Override
//           public void subscribe(ObservableEmitter<User> emitter) throws Exception {
//                Thread.sleep(2000);
//                User entity =
//                        new User("Katya Runkevich",22,
//                                "http://www.freeiconspng.com/uploads/spongebob-and-patrick-png-6.png",true);
//                emitter.onNext(entity);//переекинь данне какие-то в UI поток
//                emitter.onComplete();//закончили с этими данными
//
//            }
//        });
        return restService
                .loadUserById(id)
                .map(new Function<User, com.gmail.runkevich8.domain.entity.UserEntity>() {
                    @Override
                    public com.gmail.runkevich8.domain.entity.UserEntity apply(User user) throws Exception {
                        return new com.gmail.runkevich8.domain.entity.UserEntity(user.getUserName(),
                                user.getAge(),
                                user.getProfileUrl(),true);
                    }
                });
    }



    @Override
    public Observable<List<com.gmail.runkevich8.domain.entity.UserEntity>> getList() {
       // return Observable.just(new ArrayList<User>());
        return  restService
                .loadUsers()
                .map(new Function<List<User>, List<com.gmail.runkevich8.domain.entity.UserEntity>>() {
                    @Override
                    public List<com.gmail.runkevich8.domain.entity.UserEntity> apply(List<User> userEntities) throws Exception {

                        List<com.gmail.runkevich8.domain.entity.UserEntity> list = new ArrayList<>();
                        for (User user : userEntities){
                           list.add(new com.gmail.runkevich8.domain.entity.UserEntity(user.getUserName(),
                            user.getAge(),
                            user.getProfileUrl(),true));
                        }
                        return null;
                    }
                });
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
