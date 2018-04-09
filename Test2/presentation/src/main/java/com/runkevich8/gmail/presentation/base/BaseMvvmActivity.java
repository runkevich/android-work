package com.runkevich8.gmail.presentation.base;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.runkevich8.gmail.test.BR;

public abstract class  BaseMvvmActivity<Binding extends ViewDataBinding,
        ViewModel extends BaseViewModel , R extends Router>
        extends AppCompatActivity {

    protected ViewModel viewModel;
    protected Binding binding;

    @Nullable
    protected R router; //роутер может быть нулем (при повороте например)



    public abstract int provideLayoutId();        //для того,чтобы найти Layout
    public abstract ViewModel provideViewModel(); //нужен для поиска модели
    public abstract R provideRouter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = provideViewModel();
        binding = DataBindingUtil.setContentView(this, provideLayoutId());
        binding.setVariable(BR.viewModel,viewModel);

        router = provideRouter();
        viewModel.attachRouter(router);
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        router = null;
        viewModel.detachRouter();
    }
}
