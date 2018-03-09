package com.runkevich8.gmail.test.classwork.classwork8;


import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

public class MyEntity {

    public final  ObservableField<String> text2 = new ObservableField<String>();
   // public String text;
    public final ObservableField<String> textButton = new ObservableField<String>();
    public final ObservableBoolean buttonVisibilite = new ObservableBoolean();

    public MyEntity(String text2, String textButton, boolean buttonVisibilite) {
        this.text2.set(text2);
        this.textButton.set(textButton);
        this.buttonVisibilite.set(buttonVisibilite);
    }

    public void buttonClick(View view){
        Log.e("AAAAAAAAAAAAAAAAaaa","Button Click");
        buttonVisibilite.set(false);
    }


}
