package com.runkevich8.gmail.test.homework;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.homework.hw1.Homework1Activity;
import com.runkevich8.gmail.test.homework.hw2.Homework2Activity;
import com.runkevich8.gmail.test.homework.hw3.Homework3Activity;

public class HomeworkMain extends AppCompatActivity {

    private Button hw1;
    private Button hw2;
    private Button hw3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_main);

        hw1 = findViewById(R.id.hw_1);
        hw2 = findViewById(R.id.hw_2);
        hw3 = findViewById(R.id.hw_3);


        View.OnClickListener hw1Click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeworkMain.this,
                        Homework1Activity.class);
                startActivity(intent);
            }
        };

        hw1.setOnClickListener(hw1Click);

       // hw1.setText(BuildConfig.API_URL);

        View.OnClickListener hw2Click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeworkMain.this,
                        Homework2Activity.class);
                startActivity(intent);
            }
        };

        hw2.setOnClickListener(hw2Click);




        View.OnClickListener hw3Click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeworkMain.this,
                        Homework3Activity.class);
                startActivity(intent);
            }
        };

        hw3.setOnClickListener(hw3Click);
    }
}

