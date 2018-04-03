package com.runkevich8.gmail.presentation.screens.hw.hw10;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.base.BaseViewModel;
import com.runkevich8.gmail.test.R;


public class ActivityRetrofitHw10 extends BaseMvvmActivity implements RecyclerViewAdapter.OnClickListener{

    private RecyclerViewAdapter adaptRV;
    public static String id = "";

    @Override
    public int provideLayoutId() {
        return R.layout.activity_hw10;
    }

    @Override
    public BaseViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserEntityViewModel.class);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptRV = new RecyclerViewAdapter();
        adaptRV.setListener(this);
        RecyclerView recyclerView = binding.getRoot().findViewById(R.id.recyclePR);
        recyclerView.setAdapter(adaptRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    @Override
    public void onClick(String id) {
        ActivityRetrofitHw10.id = id;
        startActivity(new Intent(this, ActivityRetrofitHw10.class));
    }
}
