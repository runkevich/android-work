package com.runkevich8.gmail.presentation.screens.user;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gmail.runkevich8.data.sharedprefs.AppSharedPrefs;
import com.runkevich8.gmail.presentation.base.BaseMvvmActivity;
import com.runkevich8.gmail.presentation.screens.user.list.UserRouter;
import com.runkevich8.gmail.presentation.utils.ImageChooser;
import com.runkevich8.gmail.test.R;
import com.runkevich8.gmail.test.databinding.ActivityClasswork8Binding;

import java.io.File;

import javax.inject.Inject;

public class UserActivity extends BaseMvvmActivity<ActivityClasswork8Binding,UserViewModel,UserRouter> {


   private static final String KET_USER_ID = "KET_USER_ID";

   @Inject
   public AppSharedPrefs appSharedPrefs;

    public static void show(Activity activity, String id) {
        Intent intent = new Intent(activity, UserActivity.class);
        intent.putExtra(KET_USER_ID, id);
        activity.startActivity(intent);
    }
    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork8;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
    }

    @Override
    public UserRouter provideRouter() {
        return new UserRouter(this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.recyclePR.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclePR.setHasFixedSize(true);
        binding.recyclePR.setAdapter(viewModel.userAdapter);

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        toolbar.setNavigationIcon(R.drawable.ic_cloud_black_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageChooser.startCamera(UserActivity.this);
                ImageChooser.getCameraFile(UserActivity.this);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == Activity.RESULT_OK) {
            File file = ImageChooser.getImageFromResult(this, requestCode, resultCode, data);
            if (file != null){
               Log.e("OOO","File path = " + file.getAbsolutePath());
            } else {
                Log.e("OOO","OOO no file ");
            }
            //viewModel.userВыбралНовыйФайл
            //дальнейшие действия с файлом этим
            //super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionSearch :{

                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}


