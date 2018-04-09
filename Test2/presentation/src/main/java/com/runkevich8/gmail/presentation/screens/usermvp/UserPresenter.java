package com.runkevich8.gmail.presentation.screens.usermvp;

import com.runkevich8.gmail.presentation.base.BasePresenter;
import com.runkevich8.gmail.presentation.screens.user.list.UserAdapter;


public abstract class UserPresenter extends BasePresenter< UserView,UserRouter> {

    public abstract UserAdapter getUserAdapter();
    public abstract void onUserClick();

}
