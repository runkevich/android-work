package com.runkevich8.gmail.presentation.base;


//mvp
//интерфейс который гарантирует методы нужные для всех активитри
public interface BaseView {

    void showProgress();
    void dismissProgress();
    void showError(Exception e);

}
