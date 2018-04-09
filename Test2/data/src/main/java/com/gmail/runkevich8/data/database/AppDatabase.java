package com.gmail.runkevich8.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.gmail.runkevich8.data.entity.User;


@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{

    public abstract UserDatabase getUserDao();

}
