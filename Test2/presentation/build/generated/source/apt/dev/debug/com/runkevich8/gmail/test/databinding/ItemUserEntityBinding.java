package com.runkevich8.gmail.test.databinding;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemUserEntityBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView2, 3);
        sViewsWithIds.put(R.id.idUser, 4);
    }
    // views
    @NonNull
    public final android.widget.TextView idUser;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.widget.TextView textView2;
    // variables
    @Nullable
    private com.gmail.runkevich8.domain.entity.UserEntity mUserProfile;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUserEntityBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.idUser = (android.widget.TextView) bindings[4];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.textView = (android.widget.TextView) bindings[2];
        this.textView.setTag(null);
        this.textView2 = (android.widget.TextView) bindings[3];
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
        if (BR.userProfile == variableId) {
            setUserProfile((com.gmail.runkevich8.domain.entity.UserEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserProfile(@Nullable com.gmail.runkevich8.domain.entity.UserEntity UserProfile) {
        this.mUserProfile = UserProfile;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userProfile);
        super.requestRebind();
    }
    @Nullable
    public com.gmail.runkevich8.domain.entity.UserEntity getUserProfile() {
        return mUserProfile;
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
        java.lang.String userProfileUsername = null;
        com.gmail.runkevich8.domain.entity.UserEntity userProfile = mUserProfile;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userProfile != null) {
                    // read userProfile.username
                    userProfileUsername = userProfile.getUsername();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userProfileUsername);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView, userProfileUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemUserEntityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserEntityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemUserEntityBinding>inflate(inflater, com.runkevich8.gmail.test.R.layout.item_user_entity, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemUserEntityBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserEntityBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.runkevich8.gmail.test.R.layout.item_user_entity, null, false), bindingComponent);
    }
    @NonNull
    public static ItemUserEntityBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserEntityBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_user_entity_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemUserEntityBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): userProfile
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}