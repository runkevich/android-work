package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityHw101Binding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 8);
    }
    // views
    @NonNull
    public final android.widget.Button button;
    @NonNull
    public final android.widget.Button button2;
    @NonNull
    public final android.widget.EditText editText2;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    public final android.widget.TextView textView3;
    @NonNull
    public final android.widget.TextView textView4;
    @NonNull
    public final android.widget.TextView textView6;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editText2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.convertFromInt(viewModel.age.get())
            //         is viewModel.age.set((int) viewModel.convertFromString(callbackArg_0))
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText2);
            // localize variables for thread safety
            // viewModel.convertFromString(callbackArg_0)
            int viewModelConvertFromStringCallbackArg0 = 0;
            // viewModel.age.get()
            int viewModelAgeGet = 0;
            // viewModel
            com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.fullName.get()
            //         is viewModel.fullName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.fullName != null
            boolean viewModelFullNameJavaLangObjectNull = false;
            // viewModel.fullName
            android.databinding.ObservableField<java.lang.String> viewModelFullName = null;
            // viewModel.fullName.get()
            java.lang.String viewModelFullNameGet = null;
            // viewModel
            com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
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

    public ActivityHw101Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.button = (android.widget.Button) bindings[5];
        this.button.setTag(null);
        this.button2 = (android.widget.Button) bindings[6];
        this.button2.setTag(null);
        this.editText2 = (android.widget.EditText) bindings[4];
        this.editText2.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.textView3 = (android.widget.TextView) bindings[1];
        this.textView3.setTag(null);
        this.textView4 = (android.widget.TextView) bindings[8];
        this.textView6 = (android.widget.TextView) bindings[3];
        this.textView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsVisibleView((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelFullName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsVisibleView(android.databinding.ObservableBoolean ViewModelIsVisibleView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAge(android.databinding.ObservableInt ViewModelAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFullName(android.databinding.ObservableField<java.lang.String> ViewModelFullName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.databinding.ObservableBoolean viewModelIsVisibleView = null;
        java.lang.String viewModelFullNameGet = null;
        android.databinding.ObservableInt viewModelAge = null;
        int viewModelIsVisibleViewVVISIBLEVINVISIBLE = 0;
        java.lang.String stringValueOfViewModelAge = null;
        int viewModelAgeGet = 0;
        int viewModelIsVisibleViewVINVISIBLEVVISIBLE = 0;
        android.databinding.ObservableField<java.lang.String> viewModelFullName = null;
        boolean viewModelIsVisibleViewGet = false;
        com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
        java.lang.String viewModelConvertFromIntViewModelAge = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVisibleView
                        viewModelIsVisibleView = viewModel.isVisibleView;
                    }
                    updateRegistration(0, viewModelIsVisibleView);


                    if (viewModelIsVisibleView != null) {
                        // read viewModel.isVisibleView.get()
                        viewModelIsVisibleViewGet = viewModelIsVisibleView.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelIsVisibleViewGet) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isVisibleView.get() ? V.VISIBLE : V.INVISIBLE
                    viewModelIsVisibleViewVVISIBLEVINVISIBLE = ((viewModelIsVisibleViewGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                    // read viewModel.isVisibleView.get() ? V.INVISIBLE : V.VISIBLE
                    viewModelIsVisibleViewVINVISIBLEVVISIBLE = ((viewModelIsVisibleViewGet) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.age
                        viewModelAge = viewModel.age;
                    }
                    updateRegistration(1, viewModelAge);


                    if (viewModelAge != null) {
                        // read viewModel.age.get()
                        viewModelAgeGet = viewModelAge.get();
                    }


                    // read String.valueOf(viewModel.age.get())
                    stringValueOfViewModelAge = java.lang.String.valueOf(viewModelAgeGet);
                    if (viewModel != null) {
                        // read viewModel.convertFromInt(viewModel.age.get())
                        viewModelConvertFromIntViewModelAge = viewModel.convertFromInt(viewModelAgeGet);
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fullName
                        viewModelFullName = viewModel.fullName;
                    }
                    updateRegistration(2, viewModelFullName);


                    if (viewModelFullName != null) {
                        // read viewModel.fullName.get()
                        viewModelFullNameGet = viewModelFullName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.button.setOnClickListener(mCallback5);
            this.button2.setOnClickListener(mCallback6);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            this.mboundView7.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.button2.setEnabled(viewModelIsVisibleViewGet);
            this.editText2.setVisibility(viewModelIsVisibleViewVVISIBLEVINVISIBLE);
            this.mboundView2.setVisibility(viewModelIsVisibleViewVVISIBLEVINVISIBLE);
            this.textView3.setVisibility(viewModelIsVisibleViewVINVISIBLEVVISIBLE);
            this.textView6.setVisibility(viewModelIsVisibleViewVINVISIBLEVVISIBLE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText2, viewModelConvertFromIntViewModelAge);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, stringValueOfViewModelAge);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelFullNameGet);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, viewModelFullNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.remove();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.save();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.runkevich8.gmail.presentation.screens.hw.hw10.UserEntityDescViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.edit();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityHw101Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw101Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHw101Binding>inflate(inflater, com.runkevich8.gmail.test.R.layout.activity_hw10_1, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHw101Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw101Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.activity_hw10_1, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHw101Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw101Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_hw10_1_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHw101Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.isVisibleView
        flag 1 (0x2L): viewModel.age
        flag 2 (0x3L): viewModel.fullName
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.isVisibleView.get() ? V.VISIBLE : V.INVISIBLE
        flag 6 (0x7L): viewModel.isVisibleView.get() ? V.VISIBLE : V.INVISIBLE
        flag 7 (0x8L): viewModel.isVisibleView.get() ? V.INVISIBLE : V.VISIBLE
        flag 8 (0x9L): viewModel.isVisibleView.get() ? V.INVISIBLE : V.VISIBLE
    flag mapping end*/
    //end
}