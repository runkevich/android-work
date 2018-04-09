package com.runkevich8.gmail.presentation.screens.user;


import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;

import com.gmail.runkevich8.data.entity.Error;
import com.gmail.runkevich8.data.entity.ErrorType;
import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import com.runkevich8.gmail.app.App;
import com.runkevich8.gmail.presentation.base.BaseAdapter;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.presentation.screens.user.list.UserAdapter;
import com.runkevich8.gmail.presentation.screens.user.list.UserRouter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class UserViewModel extends BaseViewModel<UserRouter> {


    @Inject
    public GetUserByIdUseCase getUserByIdUseCase ;
           // new GetUserByIdUseCase(new UIThread(),new UserRepositoryImpl());

    public UserAdapter userAdapter = new UserAdapter();

    public final ObservableField<String> username = new ObservableField<String>("");
    public final ObservableField<String> profileurl = new ObservableField<String>("");
    public final ObservableInt age = new ObservableInt();
    public final ObservableBoolean gender = new ObservableBoolean();
    public final ObservableBoolean progressVisible = new ObservableBoolean();

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }
    //затем будет его создавать андроид
    public UserViewModel() {

        super();

        //IMPORTANT - обязательно проверять на ноль роутер!
        if (router!=null) router.navigateToUser("");

        //подписываемся на клик
        userAdapter
                .observeClick()
                .subscribe(new Observer<BaseAdapter.ItemEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {



                    }

                    @Override
                    public void onNext(BaseAdapter.ItemEntity itemEntity) {

                    }

                    @Override
                    public void onError(Throwable e) {

                        if (e instanceof Error){
                            Error myError = (Error) e;
                            if(myError.getVeryBiError() == ErrorType.NO_INTERNET){

                                //сюда тосты с ошибками

                            }else if (myError.getVeryBiError() == ErrorType.SERVER_NOT_AVALIBLE){

                            }
                        } else {}

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        progressVisible.set(true);
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

                        username.set(userEntity.getFullName());
                        profileurl.set(userEntity.getUrlImg());
                        age.set(userEntity.getAge());
                        gender.set(userEntity.isSex());


                       // userAdapter.setItems(list);


                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("OOOOOOOOOOOOOOOO","onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("OOOOOOOOOOOOOOOO","onComplete");
                        progressVisible.set(false);
                    }
                });
    }


}
