package com.runkevich8.gmail.injection;


import com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    public void inject(UserEntityViewModel userViewModel);


}
