package com.runkevich8.gmail.presentation.screens.hw.hw10;


import android.content.Context;
import android.databinding.InverseMethod;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.widget.Toast;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.interactor.GetUserByIdUseCase;
import com.gmail.runkevich8.domain.interactor.RemoveUserUseCase;
import com.gmail.runkevich8.domain.interactor.SaveUserUseCase;
import com.runkevich8.gmail.app.App;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.presentation.base.Router;

import javax.inject.Inject;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class UserEntityDescViewModel extends BaseViewModel<Router> {

    private PublishContractHw10 publishContractHw10;

    public void setPublishContractHw10(PublishContractHw10 publishContractHw10) {
        this.publishContractHw10 = publishContractHw10;
    }

    public final ObservableField<String> fullName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
    public final ObservableBoolean gender = new ObservableBoolean();
    public final ObservableBoolean isVisibleView = new ObservableBoolean(false);
    private String objectId;

    @Inject
    public Context context;

    @Inject
    public GetUserByIdUseCase userById;

    @Inject
    public SaveUserUseCase saveUser;

    @Inject
    public RemoveUserUseCase remove;

    public UserEntityDescViewModel() {

        if (!ActivityRetrofitHw10.id.equals("") && ActivityRetrofitHw10.id != null) {
            userById
                    .get(ActivityRetrofitHw10.id)
                    .subscribe(new Observer<UserEntity>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            compositeDisposable.add(d);
                        }

                        @Override
                        public void onNext(UserEntity userEntity) {
                            fullName.set(userEntity.getFullName());
                            age.set(userEntity.getAge());
                            gender.set(userEntity.isSex());
                            objectId = userEntity.getObjectId();
                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }

    public void edit() {
        isVisibleView.set(true);
    }

    public void save() {
        saveUser.save(new UserEntity(fullName.get(), "", age.get(), gender.get(), objectId))
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onComplete() {
                        Toast.makeText(context, "User saved",
                                Toast.LENGTH_LONG).show();
                        isVisibleView.set(false);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });

    }

    public void remove() {
        remove.
                remove(objectId)
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onComplete() {
                        Toast.makeText(context, "User deleted",
                                Toast.LENGTH_LONG).show();
                        publishContractHw10.pressBackUser();
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
    public void onDestroy() {
        super.onDestroy();
        context = null;
    }


    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }
}
