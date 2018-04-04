package com.runkevich8.gmail.presentation.screens.user;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;

public class UserActivity extends BaseMvvmActivity<ActivityClasswork8Binding,UserViewModel> {

   // UserActivity = ActivityUserBinding
    //import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;

   private static final String KET_USER_ID = "KET_USER_ID";

    public static void show(Activity activity, String id) {
        Intent intent = new Intent(activity, UserActivity.class);
        intent.putExtra(KET_USER_ID, id);
        activity.startActivity(intent);
    }
    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork8;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
      //  return new UserViewModel();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.recyclePR.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclePR.setHasFixedSize(true);
        binding.recyclePR.setAdapter(viewModel.userAdapter);


    }


}


