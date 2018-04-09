package com.runkevich8.gmail.presentation.screens.hw.hw1;


import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityHw1Binding;

public class ExchangeTextActivity extends BaseMvvmActivity<ActivityHw1Binding, ExchangeTextModel,Router> {



    @Override
    public int provideLayoutId() {
        return R.layout.activity_hw1;
    }

    @Override
    public ExchangeTextModel provideViewModel() {
        return new ExchangeTextModel();
    }

    @Override
    public Router provideRouter() {
        return null;
    }
}
