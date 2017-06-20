package com.polythinking.weijingliu.todoapp.tasks.view;

import com.polythinking.weijingliu.todoapp.tasks.ApplicationComponent;
import com.polythinking.weijingliu.todoapp.tasks.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * TasksViewComponent
 */
@Singleton
@Component(modules = TasksViewModule.class)
public interface TasksViewComponent {

  /**
   * configure TasksActivity to be injectable.
   */
  void inject(TasksActivity tasksActivity);
}
