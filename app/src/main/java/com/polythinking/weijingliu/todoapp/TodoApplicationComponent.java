package com.polythinking.weijingliu.todoapp;

import dagger.Component;

/**
 * Application component
 */
@Component(modules = TodoApplicationModule.class)
public interface TodoApplicationComponent {

  // enable TodoApplication injection.
  void inject(TodoApplication application);
}
