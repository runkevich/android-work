package com.runkevich8.gmail.test.classwork.classwork8;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;


public class Classwork8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_classwork8);

        MyEntity myEntity = new MyEntity("Текст из текста","Текст для кнопки",true);
      ActivityClasswork8Binding binding =
              DataBindingUtil.setContentView(this, R.layout.activity_classwork8);
      binding.setMyEntity(myEntity);
    }
}
