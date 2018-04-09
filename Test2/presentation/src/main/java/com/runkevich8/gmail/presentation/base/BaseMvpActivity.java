package com.runkevich8.gmail.presentation.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
//mvp
public abstract class BaseMvpActivity<Presenter extends BasePresenter , R extends Router>
        extends AppCompatActivity implements BaseView{

    protected Presenter presenter;


    @Nullable
    protected R router; //роутер может быть нулем (при повороте например)


    public abstract int provideLayoutId();        //для того,чтобы найти Layout
    public abstract Presenter providePresenter(); //нужен для поиска модели
    public abstract R provideRouter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = providePresenter();
        setContentView(provideLayoutId());

        router = provideRouter();
        presenter.attach(this,router);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        router = null;
        presenter.detach();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void showError(Exception e) {

    }
}
