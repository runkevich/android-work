
package android.databinding;
import com.runkevich8.gmail.test.BR;
@javax.annotation.Generated("Android Data Binding")
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 18;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.runkevich8.gmail.test.R.layout.activity_hw9:
                    return com.runkevich8.gmail.test.databinding.ActivityHw9Binding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.item_user_entity:
                    return com.runkevich8.gmail.test.databinding.ItemUserEntityBinding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.item_user:
                    return com.runkevich8.gmail.test.databinding.ItemUserBinding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.activity_hw10:
                    return com.runkevich8.gmail.test.databinding.ActivityHw10Binding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.activity_hw1:
                    return com.runkevich8.gmail.test.databinding.ActivityHw1Binding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.activity_classwork8:
                    return com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding.bind(view, bindingComponent);
                case com.runkevich8.gmail.test.R.layout.homework_main:
                    return com.runkevich8.gmail.test.databinding.HomeworkMainBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -1652907376: {
                if(tag.equals("layout/activity_hw9_0")) {
                    return com.runkevich8.gmail.test.R.layout.activity_hw9;
                }
                break;
            }
            case -457764959: {
                if(tag.equals("layout/item_user_entity_0")) {
                    return com.runkevich8.gmail.test.R.layout.item_user_entity;
                }
                break;
            }
            case -1243181053: {
                if(tag.equals("layout/item_user_0")) {
                    return com.runkevich8.gmail.test.R.layout.item_user;
                }
                break;
            }
            case 299196906: {
                if(tag.equals("layout/activity_hw10_0")) {
                    return com.runkevich8.gmail.test.R.layout.activity_hw10;
                }
                break;
            }
            case -1652915064: {
                if(tag.equals("layout/activity_hw1_0")) {
                    return com.runkevich8.gmail.test.R.layout.activity_hw1;
                }
                break;
            }
            case -776930613: {
                if(tag.equals("layout/activity_classwork8_0")) {
                    return com.runkevich8.gmail.test.R.layout.activity_classwork8;
                }
                break;
            }
            case -133196556: {
                if(tag.equals("layout/homework_main_0")) {
                    return com.runkevich8.gmail.test.R.layout.homework_main;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"user"
            ,"userProfile"
            ,"viewModel"};
    }
}