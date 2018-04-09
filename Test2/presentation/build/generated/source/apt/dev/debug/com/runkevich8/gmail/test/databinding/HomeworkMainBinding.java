package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class HomeworkMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hw_1, 1);
        sViewsWithIds.put(R.id.hw_2, 2);
        sViewsWithIds.put(R.id.hw_3, 3);
        sViewsWithIds.put(R.id.hw_4, 4);
        sViewsWithIds.put(R.id.hw_5, 5);
        sViewsWithIds.put(R.id.hw_6, 6);
        sViewsWithIds.put(R.id.hw_7, 7);
        sViewsWithIds.put(R.id.hw_8, 8);
        sViewsWithIds.put(R.id.hw_9, 9);
        sViewsWithIds.put(R.id.hw_10, 10);
        sViewsWithIds.put(R.id.hw_11_class, 11);
    }
    // views
    @NonNull
    public final android.widget.Button hw1;
    @NonNull
    public final android.widget.Button hw10;
    @NonNull
    public final android.widget.Button hw11Class;
    @NonNull
    public final android.widget.Button hw2;
    @NonNull
    public final android.widget.Button hw3;
    @NonNull
    public final android.widget.Button hw4;
    @NonNull
    public final android.widget.Button hw5;
    @NonNull
    public final android.widget.Button hw6;
    @NonNull
    public final android.widget.Button hw7;
    @NonNull
    public final android.widget.Button hw8;
    @NonNull
    public final android.widget.Button hw9;
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.main.MainViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeworkMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds);
        this.hw1 = (android.widget.Button) bindings[1];
        this.hw10 = (android.widget.Button) bindings[10];
        this.hw11Class = (android.widget.Button) bindings[11];
        this.hw2 = (android.widget.Button) bindings[2];
        this.hw3 = (android.widget.Button) bindings[3];
        this.hw4 = (android.widget.Button) bindings[4];
        this.hw5 = (android.widget.Button) bindings[5];
        this.hw6 = (android.widget.Button) bindings[6];
        this.hw7 = (android.widget.Button) bindings[7];
        this.hw8 = (android.widget.Button) bindings[8];
        this.hw9 = (android.widget.Button) bindings[9];
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.runkevich8.gmail.presentation.screens.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.main.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.main.MainViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static HomeworkMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeworkMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HomeworkMainBinding>inflate(inflater, com.runkevich8.gmail.test.R.layout.homework_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static HomeworkMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeworkMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.homework_main, null, false), bindingComponent);
    }
    @NonNull
    public static HomeworkMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeworkMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/homework_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HomeworkMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}