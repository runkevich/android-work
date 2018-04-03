package com.runkevich8.gmail.presentation.screens.hw.hw1;

import android.databinding.ObservableField;

import com.runkevich8.gmail.presentation.base.BaseViewModel;



public class ExchangeTextModel extends BaseViewModel {
    @Override
    public void createInject() {

    }
    public ObservableField<String> textView1 = new ObservableField<>("Text 1");
    public ObservableField<String> textView2 = new ObservableField<>("Teaxt 2");

    public void swapText() {
        String temp = textView1.get();
        textView1.set(textView2.get());
        textView2.set(temp);
    }
}
