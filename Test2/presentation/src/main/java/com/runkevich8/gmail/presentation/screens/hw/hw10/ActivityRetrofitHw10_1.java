package com.runkevich8.gmail.presentation.screens.hw.hw10;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityHw101Binding;

public class ActivityRetrofitHw10_1 extends BaseMvvmActivity<ActivityHw101Binding,UserEntityDescViewModel,Router> implements PublishContractHw10{
    @Override
    public int provideLayoutId() {
        return R.layout.activity_hw10_1;
    }

    @Override
    public UserEntityDescViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserEntityDescViewModel.class);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public Router provideRouter() {
        return null;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void pressBackUser() {
        onBackPressed();
    }

}
