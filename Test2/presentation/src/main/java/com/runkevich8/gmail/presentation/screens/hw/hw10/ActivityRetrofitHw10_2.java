package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.arch.lifecycle.ViewModelProviders;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.test.R;



public class ActivityRetrofitHw10_2 extends BaseMvvmActivity{


    @Override
    public int provideLayoutId() {
        return R.layout.activity_hw10_2;
    }

    @Override
    public BaseViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(AddUserViewModel.class);
    }

    @Override
    public Router provideRouter() {
        return null;
    }
}
