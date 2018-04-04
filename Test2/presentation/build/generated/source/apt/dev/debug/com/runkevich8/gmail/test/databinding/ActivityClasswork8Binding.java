package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityClasswork8Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclePR, 3);
    }
    // views
    @NonNull
    public final android.widget.TextView cw8Age;
    @NonNull
    public final android.widget.TextView cw8Username;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclePR;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.user.UserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClasswork8Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.cw8Age = (android.widget.TextView) bindings[2];
        this.cw8Age.setTag(null);
        this.cw8Username = (android.widget.TextView) bindings[1];
        this.cw8Username.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclePR = (android.support.v7.widget.RecyclerView) bindings[3];
        setRootTag(root);
        // listeners
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
            setViewModel((com.runkevich8.gmail.presentation.screens.user.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.user.UserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.user.UserViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGender((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelUsername((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGender(android.databinding.ObservableBoolean ViewModelGender, int fieldId) {
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
    private boolean onChangeViewModelUsername(android.databinding.ObservableField<java.lang.String> ViewModelUsername, int fieldId) {
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
        android.databinding.ObservableBoolean viewModelGender = null;
        android.databinding.ObservableInt viewModelAge = null;
        java.lang.String stringValueOfViewModelAge = null;
        android.databinding.ObservableField<java.lang.String> viewModelUsername = null;
        boolean viewModelGenderGet = false;
        int viewModelAgeGet = 0;
        int viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary = 0;
        int viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary = 0;
        java.lang.String viewModelUsernameGet = null;
        com.runkevich8.gmail.presentation.screens.user.UserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.gender
                        viewModelGender = viewModel.gender;
                    }
                    updateRegistration(0, viewModelGender);


                    if (viewModelGender != null) {
                        // read viewModel.gender.get()
                        viewModelGenderGet = viewModelGender.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelGenderGet) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
                    viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary = ((viewModelGenderGet) ? (getColorFromResource(cw8Age, R.color.colorAccent)) : (getColorFromResource(cw8Age, R.color.colorPrimary)));
                    // read viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
                    viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary = ((viewModelGenderGet) ? (getColorFromResource(cw8Username, R.color.colorAccent)) : (getColorFromResource(cw8Username, R.color.colorPrimary)));
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
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.username;
                    }
                    updateRegistration(2, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.get()
                        viewModelUsernameGet = viewModelUsername.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.cw8Age.setTextColor(viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary);
            this.cw8Username.setTextColor(viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cw8Age, stringValueOfViewModelAge);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cw8Username, viewModelUsernameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityClasswork8Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork8Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityClasswork8Binding>inflate(inflater, com.runkevich8.gmail.test.R.layout.activity_classwork8, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityClasswork8Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork8Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.activity_classwork8, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityClasswork8Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork8Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_classwork8_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityClasswork8Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.gender
        flag 1 (0x2L): viewModel.age
        flag 2 (0x3L): viewModel.username
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 6 (0x7L): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 7 (0x8L): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 8 (0x9L): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
    flag mapping end*/
    //end
}