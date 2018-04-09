package com.runkevich8.gmail.presentation.base;

import android.app.Activity;


//абстрактный класс для перехода на другие активити
// У ФРАГМЕНТОВ НЕТ РОУТЕРОВ
//базовый роутер ,котогрый хранит активити
public abstract class Router {

    private Activity activity;

    public Router(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }
    public void back(){
        getActivity().onBackPressed();
    }
}
