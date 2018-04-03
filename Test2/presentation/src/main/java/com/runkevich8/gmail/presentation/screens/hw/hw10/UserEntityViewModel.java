package com.runkevich8.gmail.presentation.screens.hw.hw10;


import android.content.Context;
import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.support.v7.widget.RecyclerView;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.entity.UserProfileEntity;
import com.gmail.runkevich8.domain.interactor.GetUserListUseCase;
import com.runkevich8.gmail.app.App;
import com.runkevich8.gmail.presentation.base.BaseViewModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class UserEntityViewModel extends  BaseViewModel {

    @Inject
    public GetUserListUseCase profileListUseCase;

    @Inject
    public Context context;


    public final ObservableField<List<UserEntity>> users = new ObservableField<>();

    @Override
    public void onStart() {
        super.onStart();
        profileListUseCase.getListUsers()
                .subscribe(new Observer<List<UserEntity>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(List<UserEntity> userProfileEntities) {
                        users.set(userProfileEntities);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
    public UserEntityViewModel() {
        App.getAppComponent().inject(this);

    }

    @Override
    public void createInject() {

    }

    @BindingAdapter("android:entries")
    public static void setAdaptRW(RecyclerView recyclerView, ObservableField<List<UserProfileEntity>> users) {
        RecyclerViewAdapter adapterRV = ( RecyclerViewAdapter) recyclerView.getAdapter();
        if (users.get() != null)
            adapterRV.setUsers(users.get());
    }

    public void addNewUser() {
        Intent intent = new Intent(context, ActivityRetrofitHw10.class );
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        context = null;
//    }
}