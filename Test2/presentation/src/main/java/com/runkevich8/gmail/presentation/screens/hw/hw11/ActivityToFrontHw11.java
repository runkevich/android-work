package com.runkevich8.gmail.presentation.screens.hw.hw11;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.runkevich8.gmail.test.R;

public class ActivityToFrontHw11 extends AppCompatActivity {

    private LinearLayout layoutTop, layoutBottom;
    private ImageButton button, button2;
    private ImageView imageView,imageView2;
    private RelativeLayout view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw11);


        layoutTop = findViewById(R.id.layout_top);
        layoutBottom = findViewById(R.id.layout_top2);
        button = findViewById(R.id.just_button);
        button2 = findViewById(R.id.just_button2);
        imageView = findViewById(R.id.imgv_main);
        imageView2 = findViewById(R.id.imgv_main2);

        layoutBottom.bringToFront();
        imageView.bringToFront();

        View.OnClickListener btnClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 layoutTop.bringToFront();
                imageView2.bringToFront();
                // layoutTop.invalidate();
                // imageView.invalidate();

            }
        };

        button2.setOnClickListener(btnClick);

    }



}
