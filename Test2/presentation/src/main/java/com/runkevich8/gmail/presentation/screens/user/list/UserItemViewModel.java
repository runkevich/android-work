package com.runkevich8.gmail.presentation.screens.user.list;



import android.databinding.ObservableField;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseItemViewModel;

public class UserItemViewModel extends BaseItemViewModel<UserEntity> {

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> age = new ObservableField<>("");

    @Override
    public void setItem(UserEntity userEntity, int position) {
        name.set(userEntity.getUsername());
        age.set(String.valueOf(userEntity.getAge()));
    }
}
