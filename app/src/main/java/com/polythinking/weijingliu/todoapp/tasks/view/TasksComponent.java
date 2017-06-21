package com.polythinking.weijingliu.todoapp.tasks.view;

import javax.inject.Singleton;

import dagger.Component;

/**
 * TasksComponent
 */
@Singleton
@Component(modules = TasksModule.class)
public interface TasksComponent {

  /**
   * configure TasksActivity to be injectable.
   */
  void inject(TasksActivity tasksActivity);
}
