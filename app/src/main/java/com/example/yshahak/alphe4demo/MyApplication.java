package com.example.yshahak.alphe4demo;

import android.app.Application;

import javax.inject.Inject;


/**
 * Created by yshahak
 * on 08/10/2016.
 */

public class MyApplication extends Application {

    private ApplicationComponent component;
    @Inject
    CalendarDataBase calendarDataBase;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}
