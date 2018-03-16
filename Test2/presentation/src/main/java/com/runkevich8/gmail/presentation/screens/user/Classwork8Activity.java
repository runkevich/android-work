package com.runkevich8.gmail.presentation.screens.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;

public class Classwork8Activity extends BaseMvvmActivity<ActivityClasswork8Binding,UserViewModel> {
   // Classwork8Activity = ActivityUserBinding
    //import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;

    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork8;
    }

    @Override
    public UserViewModel provideViewModel() {
        return new UserViewModel();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.cw8Profileurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getBaseContext(), "OOOOOO", Toast.LENGTH_LONG).show();

                UserEntity userEntity = new UserEntity();
                userEntity.setGender(false);

            }
        });

    }

}
//        binding.cw8Age.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        //RxView.onClick(binding.cw8Age);



