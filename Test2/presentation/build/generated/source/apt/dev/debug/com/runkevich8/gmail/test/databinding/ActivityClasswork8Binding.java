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
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.TextView cw8Age;
    @NonNull
    public final android.widget.ImageView cw8Profileurl;
    @NonNull
    public final android.widget.TextView cw8Username;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView4;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.user.UserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClasswork8Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 5);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.cw8Age = (android.widget.TextView) bindings[3];
        this.cw8Age.setTag(null);
        this.cw8Profileurl = (android.widget.ImageView) bindings[2];
        this.cw8Profileurl.setTag(null);
        this.cw8Username = (android.widget.TextView) bindings[1];
        this.cw8Username.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.ProgressBar) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            mDirtyFlags |= 0x20L;
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
                return onChangeViewModelProfileurl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeViewModelUsername((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelProgressVisible((android.databinding.ObservableBoolean) object, fieldId);
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
    private boolean onChangeViewModelProfileurl(android.databinding.ObservableField<java.lang.String> ViewModelProfileurl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAge(android.databinding.ObservableInt ViewModelAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(android.databinding.ObservableField<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProgressVisible(android.databinding.ObservableBoolean ViewModelProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        boolean viewModelProgressVisibleGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelProfileurl = null;
        int viewModelProgressVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableInt viewModelAge = null;
        java.lang.String stringValueOfViewModelAge = null;
        android.databinding.ObservableField<java.lang.String> viewModelUsername = null;
        android.databinding.ObservableBoolean viewModelProgressVisible = null;
        boolean viewModelGenderGet = false;
        int viewModelAgeGet = 0;
        java.lang.String viewModelProfileurlGet = null;
        int viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary = 0;
        int viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary = 0;
        java.lang.String viewModelUsernameGet = null;
        com.runkevich8.gmail.presentation.screens.user.UserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.gender
                        viewModelGender = viewModel.gender;
                    }
                    updateRegistration(0, viewModelGender);


                    if (viewModelGender != null) {
                        // read viewModel.gender.get()
                        viewModelGenderGet = viewModelGender.get();
                    }
                if((dirtyFlags & 0x61L) != 0) {
                    if(viewModelGenderGet) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
                    viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary = ((viewModelGenderGet) ? (getColorFromResource(cw8Age, R.color.colorAccent)) : (getColorFromResource(cw8Age, R.color.colorPrimary)));
                    // read viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
                    viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary = ((viewModelGenderGet) ? (getColorFromResource(cw8Username, R.color.colorAccent)) : (getColorFromResource(cw8Username, R.color.colorPrimary)));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.profileurl
                        viewModelProfileurl = viewModel.profileurl;
                    }
                    updateRegistration(1, viewModelProfileurl);


                    if (viewModelProfileurl != null) {
                        // read viewModel.profileurl.get()
                        viewModelProfileurlGet = viewModelProfileurl.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.age
                        viewModelAge = viewModel.age;
                    }
                    updateRegistration(2, viewModelAge);


                    if (viewModelAge != null) {
                        // read viewModel.age.get()
                        viewModelAgeGet = viewModelAge.get();
                    }


                    // read String.valueOf(viewModel.age.get())
                    stringValueOfViewModelAge = java.lang.String.valueOf(viewModelAgeGet);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.username;
                    }
                    updateRegistration(3, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.get()
                        viewModelUsernameGet = viewModelUsername.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progressVisible
                        viewModelProgressVisible = viewModel.progressVisible;
                    }
                    updateRegistration(4, viewModelProgressVisible);


                    if (viewModelProgressVisible != null) {
                        // read viewModel.progressVisible.get()
                        viewModelProgressVisibleGet = viewModelProgressVisible.get();
                    }
                if((dirtyFlags & 0x70L) != 0) {
                    if(viewModelProgressVisibleGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
                    viewModelProgressVisibleViewVISIBLEViewGONE = ((viewModelProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.cw8Age.setTextColor(viewModelGenderCw8AgeAndroidColorColorAccentCw8AgeAndroidColorColorPrimary);
            this.cw8Username.setTextColor(viewModelGenderCw8UsernameAndroidColorColorAccentCw8UsernameAndroidColorColorPrimary);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cw8Age, stringValueOfViewModelAge);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.runkevich8.gmail.test.homework.hw9.CustomBindingAdapter.loadImage(this.cw8Profileurl, viewModelProfileurlGet);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.cw8Username, viewModelUsernameGet);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelProgressVisibleViewVISIBLEViewGONE);
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
        flag 1 (0x2L): viewModel.profileurl
        flag 2 (0x3L): viewModel.age
        flag 3 (0x4L): viewModel.username
        flag 4 (0x5L): viewModel.progressVisible
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 10 (0xbL): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 11 (0xcL): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
        flag 12 (0xdL): viewModel.gender.get() ? @android:color/colorAccent : @android:color/colorPrimary
    flag mapping end*/
    //end
}