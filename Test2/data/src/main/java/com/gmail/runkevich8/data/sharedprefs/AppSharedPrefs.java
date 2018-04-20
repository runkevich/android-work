package com.gmail.runkevich8.data.sharedprefs;


import android.content.Context;

import javax.inject.Inject;

//писать к этому классу для чего используме(например осторожно не использовать этот класс для сохранения)
//два класса - 1) для класса 2)только для модуля дата - как в котлине internal
public class AppSharedPrefs {

    private Context context;
    private static String token;


    @Inject
    public AppSharedPrefs(Context context) {
        this.context = context;
    }

    public void saveToken(String token){

        AppSharedPrefs.token = token;
    }

    public String getToken(){

        if ( AppSharedPrefs.token != null){
            //читаем из shared pref
         AppSharedPrefs.token = "kjhkh";

        }
        return AppSharedPrefs.token;
    }
    //сюда приходят токены и обрабатываются (лучше отпраоять в рест сервис )
    // от презентейшен к домейну, затем к дате - просьба на данные

    // если не синглтон , то статик стринг
}
