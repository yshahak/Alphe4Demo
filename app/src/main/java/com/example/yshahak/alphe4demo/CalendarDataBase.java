package com.example.yshahak.alphe4demo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Yaakov Shahak
 * on 12/07/17.
 */

@Database(entities = {Month.class},  version = 1, exportSchema = false)
public abstract class CalendarDataBase extends RoomDatabase {
    public abstract MonthDao monthDao();
}
