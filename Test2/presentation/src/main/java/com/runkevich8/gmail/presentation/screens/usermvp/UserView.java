package com.runkevich8.gmail.presentation.screens.usermvp;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseView;



public interface  UserView extends BaseView{

    void showUser(UserEntity userEntity);

}
