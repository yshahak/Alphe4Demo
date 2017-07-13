package com.example.yshahak.alphe4demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Yaakov Shahak
 * on 21/06/17.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication target);

}
