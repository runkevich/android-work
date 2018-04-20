package com.runkevich8.gmail.presentation.screens.main;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.presentation.notification.NewMessageNotification;
import com.runkevich8.gmail.presentation.screens.hw.hw1.ExchangeTextActivity;
import com.runkevich8.gmail.presentation.screens.hw.hw10.ActivityRetrofitHw10;
import com.runkevich8.gmail.presentation.screens.hw.hw11.ActivityToFrontHw11;
import com.runkevich8.gmail.presentation.screens.user.UserActivity;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.HomeworkMainBinding;




public class MainActivity extends BaseMvvmActivity<HomeworkMainBinding, BaseViewModel,Router> implements View.OnClickListener{


    @Override
    public int provideLayoutId() {
        return R.layout.homework_main;
    }

    @Override
    public BaseViewModel provideViewModel() {
        return new MainViewModel();
    }

    @Override
    public Router provideRouter() {
        return null;
    }


    @Override
    public  void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.hw1.setOnClickListener(this);
        binding.hw2.setOnClickListener(this);
        binding.hw3.setOnClickListener(this);
        binding.hw4.setOnClickListener(this);
        binding.hw5.setOnClickListener(this);
        binding.hw6.setOnClickListener(this);
        binding.hw7.setOnClickListener(this);
        binding.hw8.setOnClickListener(this);
        binding.hw9.setOnClickListener(this);
        binding.hw10.setOnClickListener(this);
        binding.hw11.setOnClickListener(this);
        binding.hw11Class.setOnClickListener(this);

        NewMessageNotification.notify(this,"dgfrg",5);

    }



    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.hw_1:
                Intent intent = new Intent(this, ExchangeTextActivity.class);
                startActivity(intent);
                break;
                case R.id.hw_10:
                    intent = new Intent(this, ActivityRetrofitHw10.class);
                    startActivity(intent);
                    break;
            case R.id.hw_11_class:
                intent = new Intent(this, UserActivity.class);
                startActivity(intent);
                break;
            case R.id.hw_11:
                intent = new Intent(this, ActivityToFrontHw11.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "We are haven't this hw", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
