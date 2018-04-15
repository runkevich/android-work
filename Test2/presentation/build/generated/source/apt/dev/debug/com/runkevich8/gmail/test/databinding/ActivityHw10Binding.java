package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityHw10Binding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layou_rv, 3);
        sViewsWithIds.put(R.id.layout_second, 4);
    }
    // views
    @NonNull
    public final android.widget.Button buttonFirst;
    @NonNull
    public final android.widget.LinearLayout layouRv;
    @NonNull
    public final android.widget.RelativeLayout layoutParent;
    @NonNull
    public final android.widget.LinearLayout layoutSecond;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclePR;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHw10Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.buttonFirst = (android.widget.Button) bindings[1];
        this.buttonFirst.setTag(null);
        this.layouRv = (android.widget.LinearLayout) bindings[3];
        this.layoutParent = (android.widget.RelativeLayout) bindings[0];
        this.layoutParent.setTag(null);
        this.layoutSecond = (android.widget.LinearLayout) bindings[4];
        this.recyclePR = (android.support.v7.widget.RecyclerView) bindings[2];
        this.recyclePR.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUsers((android.databinding.ObservableField<java.util.List<com.gmail.runkevich8.domain.entity.UserEntity>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUsers(android.databinding.ObservableField<java.util.List<com.gmail.runkevich8.domain.entity.UserEntity>> ViewModelUsers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        android.databinding.ObservableField<java.util.List<com.gmail.runkevich8.domain.entity.UserEntity>> viewModelUsers = null;
        java.util.List<com.gmail.runkevich8.domain.entity.UserEntity> viewModelUsersGet = null;
        com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.users
                    viewModelUsers = viewModel.users;
                }
                updateRegistration(0, viewModelUsers);


                if (viewModelUsers != null) {
                    // read viewModel.users.get()
                    viewModelUsersGet = viewModelUsers.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonFirst.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel.setAdaptRW(this.recyclePR, viewModelUsers);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.addNewUser();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityHw10Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw10Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHw10Binding>inflate(inflater, com.runkevich8.gmail.test.R.layout.activity_hw10, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHw10Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw10Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.activity_hw10, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHw10Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw10Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_hw10_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHw10Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.users
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}