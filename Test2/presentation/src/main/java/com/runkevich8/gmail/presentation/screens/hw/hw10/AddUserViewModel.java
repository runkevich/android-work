package com.runkevich8.gmail.presentation.screens.hw.hw10;


import android.content.Context;
import android.databinding.InverseMethod;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.widget.Toast;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.interactor.AddNewUserUseCase;
import com.runkevich8.gmail.app.App;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.presentation.base.Router;

import javax.inject.Inject;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

public class AddUserViewModel extends BaseViewModel<Router> {
    public final ObservableField<String> fullName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

    @Inject
    public AddNewUserUseCase addUser;

    @Inject
    public Context context;

    public AddUserViewModel() {
        App.getAppComponent().inject(this);
    }

    public void addNewUser() {
        addUser
                .addNewUser(new UserEntity(fullName.get(), "", age.get(), false, ""))
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {
                        Toast.makeText(context, "User saved",
                                Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });

    }

    @InverseMethod("convertFromString")
    public String convertFromInt(int age) {
        return String.valueOf(age);
    }

    public int convertFromString(String age) {
        if (age.length() == 0)
            return 0;
        return Integer.valueOf(age);
    }

    @Override
    public void createInject() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        context = null;
    }
}