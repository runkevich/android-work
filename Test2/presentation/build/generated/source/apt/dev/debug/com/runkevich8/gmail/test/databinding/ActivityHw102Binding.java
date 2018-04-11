package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityHw102Binding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.EditText editText;
    @NonNull
    public final android.widget.EditText editText3;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.fullName.get()
            //         is viewModel.fullName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
            // localize variables for thread safety
            // viewModel.fullName != null
            boolean viewModelFullNameJavaLangObjectNull = false;
            // viewModel.fullName
            android.databinding.ObservableField<java.lang.String> viewModelFullName = null;
            // viewModel.fullName.get()
            java.lang.String viewModelFullNameGet = null;
            // viewModel
            com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFullName = viewModel.fullName;

                viewModelFullNameJavaLangObjectNull = (viewModelFullName) != (null);
                if (viewModelFullNameJavaLangObjectNull) {




                    viewModelFullName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener editText3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.convertFromInt(viewModel.age.get())
            //         is viewModel.age.set((int) viewModel.convertFromString(callbackArg_0))
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText3);
            // localize variables for thread safety
            // viewModel.convertFromString(callbackArg_0)
            int viewModelConvertFromStringCallbackArg0 = 0;
            // viewModel.age.get()
            int viewModelAgeGet = 0;
            // viewModel
            com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel viewModel = mViewModel;
            // (int) viewModel.convertFromString(callbackArg_0)
            int intViewModelConvertFromStringCallbackArg0 = 0;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.age != null
            boolean viewModelAgeJavaLangObjectNull = false;
            // viewModel.age
            android.databinding.ObservableInt viewModelAge = null;
            // viewModel.convertFromInt(viewModel.age.get())
            java.lang.String viewModelConvertFromIntViewModelAge = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAge = viewModel.age;

                viewModelAgeJavaLangObjectNull = (viewModelAge) != (null);
                if (viewModelAgeJavaLangObjectNull) {





                    viewModelConvertFromStringCallbackArg0 = viewModel.convertFromString(callbackArg_0);

                    intViewModelConvertFromStringCallbackArg0 = ((int) (viewModelConvertFromStringCallbackArg0));

                    viewModelAge.set(intViewModelConvertFromStringCallbackArg0);
                }
            }
        }
    };

    public ActivityHw102Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.editText = (android.widget.EditText) bindings[1];
        this.editText.setTag(null);
        this.editText3 = (android.widget.EditText) bindings[2];
        this.editText3.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelFullName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAge(android.databinding.ObservableInt ViewModelAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFullName(android.databinding.ObservableField<java.lang.String> ViewModelFullName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String viewModelFullNameGet = null;
        android.databinding.ObservableInt viewModelAge = null;
        int viewModelAgeGet = 0;
        android.databinding.ObservableField<java.lang.String> viewModelFullName = null;
        com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel viewModel = mViewModel;
        java.lang.String viewModelConvertFromIntViewModelAge = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.age
                        viewModelAge = viewModel.age;
                    }
                    updateRegistration(0, viewModelAge);


                    if (viewModelAge != null) {
                        // read viewModel.age.get()
                        viewModelAgeGet = viewModelAge.get();
                    }


                    if (viewModel != null) {
                        // read viewModel.convertFromInt(viewModel.age.get())
                        viewModelConvertFromIntViewModelAge = viewModel.convertFromInt(viewModelAgeGet);
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fullName
                        viewModelFullName = viewModel.fullName;
                    }
                    updateRegistration(1, viewModelFullName);


                    if (viewModelFullName != null) {
                        // read viewModel.fullName.get()
                        viewModelFullNameGet = viewModelFullName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelFullNameGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText3androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText3, viewModelConvertFromIntViewModelAge);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.runkevich8.gmail.presentation.screens.hw.hw10.AddUserViewModel viewModel = mViewModel;
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
    public static ActivityHw102Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw102Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHw102Binding>inflate(inflater, com.runkevich8.gmail.test.R.layout.activity_hw10_2, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHw102Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw102Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.activity_hw10_2, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHw102Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw102Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_hw10_2_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHw102Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.age
        flag 1 (0x2L): viewModel.fullName
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}