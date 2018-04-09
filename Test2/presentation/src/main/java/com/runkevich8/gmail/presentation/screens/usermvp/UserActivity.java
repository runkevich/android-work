package com.runkevich8.gmail.presentation.screens.usermvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseMvpActivity;
import com.runkevich8.gmail.presentation.screens.user.list.UserRouter;
import com.runkevich8.gmail.test.R;




public class UserActivity extends BaseMvpActivity<UserPresenter,UserRouter>
implements UserView{


   private static final String KET_USER_ID = "KET_USER_ID";

    public static void show(Activity activity, String id) {
        Intent intent = new Intent(activity, UserActivity.class);
        intent.putExtra(KET_USER_ID, id);
        activity.startActivity(intent);
    }
    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork8; // аннтоация для java!
    }

    @Override
    public UserPresenter providePresenter() {
        return new SingUserPresenter(); //здесь есть возможность вернуть разные презентеры(которые наследуютсч от бейз презенторов)
    }

    @Override
    public UserRouter provideRouter() {
        return new UserRouter(this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //вот здесь данные эти определить

        RecyclerView recyclerView = findViewById(R.id.recyclePR);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(presenter.getUserAdapter());

        presenter.onUserClick();
    }


    @Override
    public void showUser(UserEntity userEntity) {
        //закидываем данные в xml, например в TextView
        //(нужно предварительно для них сделтаь findViewById)
    }
}


