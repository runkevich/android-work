package com.runkevich8.gmail.presentation.screens.user.list;

import android.app.Activity;
import android.content.Intent;

import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.presentation.screens.user.UserActivity;

//абстрактный класс для перехода на другие активити
// У ФРАГМЕНТОВ НЕТ РОУТЕРОВ
// то куда мы можем попасть

public class UserRouter extends Router {

    public UserRouter(Activity activity) {
        super(activity);
    }

    public void navigateToUser(String id){

        //знать ссылку на активити нужно

        Intent intent = new Intent(getActivity(), UserActivity.class);
        intent.putExtra("key",id);
        getActivity().startActivity(intent);

        //альтернативный вариант
        UserActivity.show(getActivity(), id);
    }



}
