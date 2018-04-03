package com.runkevich8.gmail.presentation.screens.user.list;


import android.view.ViewGroup;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseAdapter;

public class UserAdapter extends BaseAdapter<UserEntity,UserItemViewModel> {
    @Override
    public UserItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return UserItemViewHolder.create(parent,new UserItemViewModel());
    }
}
