package com.gmail.runkevich8.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.gmail.runkevich8.data.entity.User;

import java.util.List;

import io.reactivex.Flowable;


@Dao
public interface UserDao {

    @Insert
    void insert(List<User> userList);

    @Query("SELECT * FROM User")
    Flowable<List<User>> getAll();

    //здесь id = потому что user переименовали колонку  @ColumnInfo(name = "id")
    @Query("SELECT * FROM User WHERE id = :id LIMIT 1")
    Flowable<List<User>> getById(String id);

    @Query("DELETE FROM User")
    void deleteAll();

}
