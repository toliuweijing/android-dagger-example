package com.polythinking.weijingliu.todoapp.di;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;

/**
 * Module for constructing android object graph.
 */
@Module(includes = AndroidInjectionModule.class)
public class DiModule {

  private final Application mApplication;

  public DiModule(Application application) {
    mApplication = application;
  }

  @Provides
  Context providesContext() {
    return mApplication;
  }
}
