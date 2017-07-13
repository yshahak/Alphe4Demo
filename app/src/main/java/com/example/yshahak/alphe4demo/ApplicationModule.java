package com.example.yshahak.alphe4demo;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.ContentResolver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yaakov Shahak
 * on 21/06/17.
 */

@SuppressWarnings("WeakerAccess")
@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides @Singleton
    public ContentResolver provideContentResolver(){
        return application.getContentResolver();
    }

//    @Provides @Singleton
//    public MonthViewModelFactory provideMonthViewModelFactory(){
//        return new MonthViewModelFactory(provideDaysRepo());
//    }

    @Provides @Singleton
    public CalendarDataBase provideDataBase(){
        return Room.databaseBuilder(application,
                CalendarDataBase.class, "calendarDB").build();
    }

}
