package com.gmail.runkevich8.data.repository;


import android.content.Context;

import com.gmail.runkevich8.data.database.AppDatabase;
import com.gmail.runkevich8.data.database.UserDatabase;
import com.gmail.runkevich8.data.entity.User;
import com.gmail.runkevich8.data.net.RestService;
import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class UserRepositoryImpl implements UserRepository{

    private Context context;
    private RestService restService;
    private UserDatabase userDatabase;

    public UserRepositoryImpl(RestService restService, AppDatabase appDataBase) {
        this.restService = restService;
        this.userDatabase = appDataBase.getUserDao();
    }

    @Override
    public Observable<UserEntity> get(String id) {

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
                .map(new Function<User, UserEntity>() {
                    @Override
                    public UserEntity apply(User user) throws Exception {
                        return (new UserEntity(user.getUsername(),
                                user.getProfileUrl(),
                                user.getAge(),
                                user.isSex(),
                                user.getObjectId()));
                    }
                });
    }



    @Override
    public Observable<List<UserEntity>> getList() {
       // return Observable.just(new ArrayList<User>());
        return  restService
                .loadUsers()
                .map(new Function<List<User>, List<UserEntity>>() {
                    @Override
                    public List<UserEntity> apply(List<User> userEntities) throws Exception {

                        List<UserEntity> list = new ArrayList<>();
                        for (User user : userEntities){
                            list.add(new UserEntity(user.getUsername(),
                                    user.getProfileUrl(),
                                    user.getAge(),
                                    user.isSex(),
                                    user.getObjectId()));
                        }
                        return list;
                    }
                });
    }

    @Override
    public Completable save(UserEntity entity) {
//        return restService
//                .save(new UserEntity(
//                        entity.getUsername(),
//                        entity.getAge(),
//                        entity.getProfileUrl(),true
//                ));
        return  null;
    }

    @Override
    public Completable addUser(UserEntity entity) {
        return null;
    }

    @Override
    public Completable remove(String id) {
        return null;
    }

}
