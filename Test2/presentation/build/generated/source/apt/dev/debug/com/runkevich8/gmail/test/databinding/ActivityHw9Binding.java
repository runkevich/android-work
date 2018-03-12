package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityHw9Binding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.ImageView colorImage;
    @NonNull
    public final android.widget.TextView hw9Age;
    @NonNull
    public final android.widget.TextView hw9Name;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private com.runkevich8.gmail.test.homework.hw9.User mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHw9Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.colorImage = (android.widget.ImageView) bindings[1];
        this.colorImage.setTag(null);
        this.hw9Age = (android.widget.TextView) bindings[3];
        this.hw9Age.setTag(null);
        this.hw9Name = (android.widget.TextView) bindings[2];
        this.hw9Name.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
        if (BR.user == variableId) {
            setUser((com.runkevich8.gmail.test.homework.hw9.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.runkevich8.gmail.test.homework.hw9.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.test.homework.hw9.User getUser() {
        return mUser;
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
        java.lang.String userName = null;
        java.lang.String userSurName = null;
        boolean userGender = false;
        java.lang.String userNameChar = null;
        java.lang.String userImageUrl = null;
        java.lang.String userAge = null;
        com.runkevich8.gmail.test.homework.hw9.User user = mUser;
        java.lang.String userNameCharUserSurName = null;
        int userGenderHw9NameAndroidColorColorAccentHw9NameAndroidColorColorPrimary = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.surName
                    userSurName = user.getSurName();
                    // read user.gender
                    userGender = user.isGender();
                    // read user.imageUrl
                    userImageUrl = user.getImageUrl();
                    // read user.age
                    userAge = user.getAge();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(userGender) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read (user.name) + (' ')
                userNameChar = (userName) + (' ');
                // read user.gender ? @android:color/colorAccent : @android:color/colorPrimary
                userGenderHw9NameAndroidColorColorAccentHw9NameAndroidColorColorPrimary = ((userGender) ? (getColorFromResource(hw9Name, R.color.colorAccent)) : (getColorFromResource(hw9Name, R.color.colorPrimary)));


                // read ((user.name) + (' ')) + (user.surName)
                userNameCharUserSurName = (userNameChar) + (userSurName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.runkevich8.gmail.test.homework.hw9.CustomBindingAdapter.loadImage(this.colorImage, userImageUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.hw9Age, userAge);
            this.hw9Name.setTextColor(userGenderHw9NameAndroidColorColorAccentHw9NameAndroidColorColorPrimary);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.hw9Name, userNameCharUserSurName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityHw9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHw9Binding>inflate(inflater, com.runkevich8.gmail.test.R.layout.activity_hw9, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHw9Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.activity_hw9, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHw9Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHw9Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_hw9_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHw9Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
        flag 2 (0x3L): user.gender ? @android:color/colorAccent : @android:color/colorPrimary
        flag 3 (0x4L): user.gender ? @android:color/colorAccent : @android:color/colorPrimary
    flag mapping end*/
    //end
}