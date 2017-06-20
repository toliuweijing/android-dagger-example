package com.polythinking.weijingliu.todoapp.tasks;

import com.polythinking.weijingliu.todoapp.tasks.view.TasksViewModule;

import dagger.Module;

/**
 * Module for the application
 */
@Module(
    includes = TasksViewModule.class
)
public class ApplicationModule {
}
