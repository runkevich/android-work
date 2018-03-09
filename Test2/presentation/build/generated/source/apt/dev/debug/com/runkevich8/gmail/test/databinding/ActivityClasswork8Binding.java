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
    public final android.widget.Button buttonCw8;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView textViewCw8;
    // variables
    @Nullable
    private com.runkevich8.gmail.test.classwork.classwork8.MyEntity mMyEntity;
    // values
    // listeners
    private OnClickListenerImpl mMyEntityButtonClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityClasswork8Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.buttonCw8 = (android.widget.Button) bindings[2];
        this.buttonCw8.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewCw8 = (android.widget.TextView) bindings[1];
        this.textViewCw8.setTag(null);
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
        if (BR.myEntity == variableId) {
            setMyEntity((com.runkevich8.gmail.test.classwork.classwork8.MyEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyEntity(@Nullable com.runkevich8.gmail.test.classwork.classwork8.MyEntity MyEntity) {
        this.mMyEntity = MyEntity;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.myEntity);
        super.requestRebind();
    }
    @Nullable
    public com.runkevich8.gmail.test.classwork.classwork8.MyEntity getMyEntity() {
        return mMyEntity;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMyEntityButtonVisibilite((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeMyEntityText2((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMyEntityTextButton((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMyEntityButtonVisibilite(android.databinding.ObservableBoolean MyEntityButtonVisibilite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMyEntityText2(android.databinding.ObservableField<java.lang.String> MyEntityText2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMyEntityTextButton(android.databinding.ObservableField<java.lang.String> MyEntityTextButton, int fieldId) {
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
        android.databinding.ObservableBoolean myEntityButtonVisibilite = null;
        int myEntityButtonVisibiliteViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener myEntityButtonClickAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.String> myEntityText2 = null;
        com.runkevich8.gmail.test.classwork.classwork8.MyEntity myEntity = mMyEntity;
        boolean myEntityButtonVisibiliteGet = false;
        android.databinding.ObservableField<java.lang.String> myEntityTextButton = null;
        java.lang.String myEntityText2Get = null;
        java.lang.String myEntityTextButtonGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (myEntity != null) {
                        // read myEntity.buttonVisibilite
                        myEntityButtonVisibilite = myEntity.buttonVisibilite;
                    }
                    updateRegistration(0, myEntityButtonVisibilite);


                    if (myEntityButtonVisibilite != null) {
                        // read myEntity.buttonVisibilite.get()
                        myEntityButtonVisibiliteGet = myEntityButtonVisibilite.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(myEntityButtonVisibiliteGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read myEntity.buttonVisibilite.get() ? View.VISIBLE : View.GONE
                    myEntityButtonVisibiliteViewVISIBLEViewGONE = ((myEntityButtonVisibiliteGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (myEntity != null) {
                        // read myEntity::buttonClick
                        myEntityButtonClickAndroidViewViewOnClickListener = (((mMyEntityButtonClickAndroidViewViewOnClickListener == null) ? (mMyEntityButtonClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mMyEntityButtonClickAndroidViewViewOnClickListener).setValue(myEntity));
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (myEntity != null) {
                        // read myEntity.text2
                        myEntityText2 = myEntity.text2;
                    }
                    updateRegistration(1, myEntityText2);


                    if (myEntityText2 != null) {
                        // read myEntity.text2.get()
                        myEntityText2Get = myEntityText2.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (myEntity != null) {
                        // read myEntity.textButton
                        myEntityTextButton = myEntity.textButton;
                    }
                    updateRegistration(2, myEntityTextButton);


                    if (myEntityTextButton != null) {
                        // read myEntity.textButton.get()
                        myEntityTextButtonGet = myEntityTextButton.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.buttonCw8.setVisibility(myEntityButtonVisibiliteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.buttonCw8, myEntityTextButtonGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.buttonCw8.setOnClickListener(myEntityButtonClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textViewCw8, myEntityText2Get);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.runkevich8.gmail.test.classwork.classwork8.MyEntity value;
        public OnClickListenerImpl setValue(com.runkevich8.gmail.test.classwork.classwork8.MyEntity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.buttonClick(arg0);
        }
    }
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
        flag 0 (0x1L): myEntity.buttonVisibilite
        flag 1 (0x2L): myEntity.text2
        flag 2 (0x3L): myEntity.textButton
        flag 3 (0x4L): myEntity
        flag 4 (0x5L): null
        flag 5 (0x6L): myEntity.buttonVisibilite.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): myEntity.buttonVisibilite.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}