package com.runkevich8.gmail.presentation.base;



public abstract class BaseItemViewModel<Model> {

    public abstract void setItem(Model model,int position);

    public void init(){

    }

    public void release(){


    }

}
