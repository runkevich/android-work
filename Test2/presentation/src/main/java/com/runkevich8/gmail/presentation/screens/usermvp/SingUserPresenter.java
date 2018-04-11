package com.runkevich8.gmail.presentation.screens.usermvp;

import android.util.Log;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import com.runkevich8.gmail.app.App;
import com.runkevich8.gmail.presentation.screens.user.list.UserAdapter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class SingUserPresenter extends UserPresenter {

    @Inject
    public GetUserByIdUseCase getUserByIdUseCase ;

    public UserAdapter userAdapter = new UserAdapter();

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    public SingUserPresenter() {


        view.showProgress(); // view  - это наше activity

        getUserByIdUseCase
                .get("id")
                .subscribe(new Observer<UserEntity>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("OOOOOOOOOOOOOOOO","onSubscribe");
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(UserEntity userEntity) {
                        Log.e("OOOOOOOOOOOOOOOO","onNext");

                        view.showUser(userEntity);
                      //TODO Implement


                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("OOOOOOOOOOOOOOOO","onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("OOOOOOOOOOOOOOOO","onComplete");
                       view.dismissProgress();
                    }
                });

    }


    @Override
    public UserAdapter getUserAdapter() {
        return null;
    }

    public void onUserClick(){
        //здесь все делается то анимация,то цвето
        // поменять,сюда клики перекидываем
    }


}
