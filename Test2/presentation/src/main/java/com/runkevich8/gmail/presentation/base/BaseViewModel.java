package com.runkevich8.gmail.presentation.base;


import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel<R extends Router> extends ViewModel{

    @Nullable
    protected R router; //роутер может быть нулем (при повороте например)

    //может всё внутри отписать, как массив disposable
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BaseViewModel(){
        super();
        createInject();
    }

    public abstract void createInject();

    public void attachRouter(R router){
        this.router = router;

    }
    public void detachRouter() {
        this.router = null;

    }

    public void onStart(){

    }
    public void onResume() {

    }

    public void onPause(){

    }
    public void onStop(){

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if(!compositeDisposable.isDisposed()){
            compositeDisposable.dispose();
        }
    }
}
