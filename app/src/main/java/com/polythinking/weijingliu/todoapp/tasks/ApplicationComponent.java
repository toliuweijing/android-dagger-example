package com.polythinking.weijingliu.todoapp.tasks;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Application component
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  // enable TodoApplication injection.
  void inject(TodoApplication application);
}
