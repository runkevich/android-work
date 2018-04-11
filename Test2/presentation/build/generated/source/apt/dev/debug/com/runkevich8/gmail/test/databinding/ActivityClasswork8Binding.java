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
        sViewsWithIds.put(R.id.cw8_username, 1);
        sViewsWithIds.put(R.id.cw8_age, 2);
        sViewsWithIds.put(R.id.progressBar, 3);
        sViewsWithIds.put(R.id.recyclePR, 4);
    }
    // views
    @NonNull
    public final android.widget.TextView cw8Age;
    @NonNull
    public final android.widget.TextView cw8Username;
    @NonNull
    public final android.widget.RelativeLayout linearLayout;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclePR;
    // variables
    @Nullable
    private com.runkevich8.gmail.presentation.screens.user.UserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClasswork8Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.cw8Age = (android.widget.TextView) bindings[2];
        this.cw8Username = (android.widget.TextView) bindings[1];
        this.linearLayout = (android.widget.RelativeLayout) bindings[0];
        this.linearLayout.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[3];
        this.recyclePR = (android.support.v7.widget.RecyclerView) bindings[4];
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
            setViewModel((com.runkevich8.gmail.presentation.screens.user.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.runkevich8.gmail.presentation.screens.user.UserViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public com.runkevich8.gmail.presentation.screens.user.UserViewModel getViewModel() {
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
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}