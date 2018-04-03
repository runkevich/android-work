package com.runkevich8.gmail.presentation.screens.user.list;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.runkevich8.gmail.presentation.base.BaseItemViewHolder;
import com.runkevich8.gmail.test.databinding.ItemUserBinding;

public class UserItemViewHolder
        extends BaseItemViewHolder<UserEntity,
        UserItemViewModel,ItemUserBinding>{

    public UserItemViewHolder(ItemUserBinding binding, UserItemViewModel viewModel) {
        super(binding, viewModel);
    }

    public static  UserItemViewHolder create(ViewGroup parent,UserItemViewModel viewModel){
        ItemUserBinding binding =
                ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new UserItemViewHolder(binding, viewModel);

    }
}
