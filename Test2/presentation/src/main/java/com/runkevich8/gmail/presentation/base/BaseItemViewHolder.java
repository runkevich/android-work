package com.runkevich8.gmail.presentation.base;


import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.runkevich8.gmail.test.BR;

public abstract class BaseItemViewHolder<Model,
        ViewModel extends BaseItemViewModel,
        Binding extends ViewDataBinding> extends RecyclerView.ViewHolder {


    private Binding binding;
    private ViewModel viewModel;

    public BaseItemViewHolder(Binding binding,ViewModel viewModel) {

        super(binding.getRoot());
        this.binding = binding;
        this.viewModel = viewModel;
        viewModel.init();// this.viewModel.init();( тоже самое)
        initViewModel();
    }

    public ViewModel getViewModel() {
        return viewModel;
    }

    protected void initViewModel(){
        binding.setVariable(BR.viewModel, viewModel);
    }

    public void bindTo(Model model, int position){
        viewModel.setItem(model,position);
        binding.executePendingBindings(); // xml появляется раньше viewModel - помогает насильно подписаться

    }

    //уведомлять о уничтожении

    public void release(){
        this.viewModel.release();
    }
}
