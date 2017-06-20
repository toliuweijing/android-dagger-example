package com.polythinking.weijingliu.todoapp.tasks;

import android.app.Activity;
import android.app.Application;

import com.polythinking.weijingliu.todoapp.di.DiModule;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Custom application class
 */
public class TodoApplication extends Application implements HasActivityInjector {

  @Inject DispatchingAndroidInjector<Activity> mDispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();

    // Install modules to the application.
    ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
        .diModule(new DiModule(this))
        .build();
    applicationComponent.inject(this);
  }

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return mDispatchingAndroidInjector;
  }
}
