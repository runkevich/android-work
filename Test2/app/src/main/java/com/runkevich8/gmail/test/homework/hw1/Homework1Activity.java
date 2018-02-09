package com.runkevich8.gmail.test.homework.hw1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.runkevich8.gmail.test.R;

public class Homework1Activity extends AppCompatActivity {

    private Button button;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);


    }
}
