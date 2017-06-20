package com.polythinking.weijingliu.todoapp.tasks.view;

import android.app.Activity;
import android.content.Context;

import com.polythinking.weijingliu.todoapp.di.DiModule;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Module for tasks view
 */
@Module(includes = DiModule.class)
public abstract class TasksViewModule {

  /**
   * generate injector for TasksActivity.
   */
  @ContributesAndroidInjector
  abstract TasksActivity contributeYourActivityInjector();
}
