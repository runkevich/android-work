package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.Router;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityHw10Binding;


public class ActivityRetrofitHw10 extends BaseMvvmActivity<ActivityHw10Binding, UserEntityViewModel,Router> implements RecyclerViewAdapter.OnClickListener{

    private RecyclerViewAdapter adaptRV;
    public static String id = "";
    public LinearLayout layoutTop, layoutBottom;


    @Override
    public int provideLayoutId() {
        return R.layout.activity_hw10;
    }

    @Override
    public UserEntityViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserEntityViewModel.class);
    }

    @Override
    public Router provideRouter() {
        return null;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptRV = new RecyclerViewAdapter();
        adaptRV.setListener(this);
        RecyclerView recyclerView = binding.recyclePR;

        recyclerView.setAdapter(adaptRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));



//
//        layoutTop = (LinearLayout) binding.layoutSecond;
//        layoutBottom = (LinearLayout) binding.layoutSecond;

//
//        //layoutTop.setVisibility(View.GONE);
//        layoutTop.bringToFront();
//       // layoutBottom.setBackgroundColor(Color.GRAY);
//        layoutBottom.invalidate();
//        layoutBottom.bringToFront();
//       // layoutTop.setBackgroundColor(Color.GRAY);
//        layoutTop.invalidate();


        //layoutTop.invalidate();

      //  Animation logoMoveAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
      //  recyclerView.startAnimation(logoMoveAnimation); // TranslateAnimation
       // layoutBottom.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(String id) {
        ActivityRetrofitHw10.id = id;
        startActivity(new Intent(this, ActivityRetrofitHw10_1.class));
    }

    public void setOverlayVisibility(boolean isVisible) {
        final LinearLayout overlay = (LinearLayout) findViewById(R.id.layout_second);

        if (isVisible) {
            overlay.setVisibility(View.VISIBLE);
            overlay.setClickable(true);
            overlay.bringToFront();
        }
        else {
            overlay.setVisibility(View.GONE);
        }
    }
}
