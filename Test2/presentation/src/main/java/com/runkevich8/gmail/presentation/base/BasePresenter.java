package com.runkevich8.gmail.presentation.base;


import android.support.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;
//mvp
public abstract class BasePresenter<View extends BaseView,R extends Router> {

    @Nullable
    protected R router; //роутер может быть нулем (при повороте например)

    @Nullable
    protected View view;//по сути ,как роутер

    //может всё внутри отписать, как массив disposable
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BasePresenter(){
        super();
        createInject();
    }

    public abstract void createInject();

    public void attach(View view,R router){
        this.view = view;
        this.router = router;

    }
    public void detach() {
        this.view = null;
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

    public void onDestroy() {
        if(!compositeDisposable.isDisposed()){
            compositeDisposable.dispose();
        }
    }
}
