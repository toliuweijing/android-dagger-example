package com.polythinking.weijingliu.todoapp;

import com.polythinking.weijingliu.todoapp.tasks.view.TasksViewModule;

import dagger.Module;

/**
 * Module for the application
 */
@Module(
    includes = TasksViewModule.class
)
public class TodoApplicationModule {
}
