package com.runkevich8.gmail.injection;


import com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel;
import com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel;
import com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel;
import com.runkevich8.gmail.presentation.screens.user.UserViewModel;
import com.runkevich8.gmail.presentation.screens.usermvp.SingUserPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(UserViewModel userViewModel);

    void inject(UserEntityViewModel userEntityViewModel);

    void inject(SingUserPresenter singUserPresenter);

    void inject(UserEntityDescViewModel userEntityDescViewModel);

    void inject (AddUserViewModel addUserViewModel);

//
//    void inject(AddUserViewModel addNewUser);
//
//    void inject(UserPFViewModel userPFViewModel);//указываем в каком классе будут произведена сборка
//    //объекта требующего инжекции


}
