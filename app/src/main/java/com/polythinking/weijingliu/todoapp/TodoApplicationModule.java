package com.polythinking.weijingliu.todoapp;

import com.polythinking.weijingliu.todoapp.tasks.view.TasksModule;

import dagger.Module;

/**
 * Module for the application
 */
@Module(
    includes = TasksModule.class
)
public class TodoApplicationModule {
}
