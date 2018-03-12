package com.runkevich8.gmail.test.homework.hw8;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.runkevich8.gmail.test.R;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;


public class Homework8Activity extends AppCompatActivity implements PublishContract{
    public PublishSubject<Integer> publishSubject =PublishSubject.create(); //почта - умеет получать событие
    private Observable<Long> observable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw8);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.containerFragment_hw8, OneFragmentHw8.getInstance("",""));
            fragmentTransaction.commit();
        }
        observable = Observable.interval(1, TimeUnit.SECONDS);
    }

    public Observable<Long> getObservable() {
        return observable;
    }
}
