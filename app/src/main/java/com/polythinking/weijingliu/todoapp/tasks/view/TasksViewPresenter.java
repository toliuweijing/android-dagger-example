package com.polythinking.weijingliu.todoapp.tasks.view;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Controller for tasks view.
 */
@Singleton
public class TasksViewPresenter implements TasksContract.TasksPresenter {

  private final Context mContext;

  private TasksContract.TasksView mTasksView;

  @Inject
  public TasksViewPresenter(Context context) {
    mContext = context;
  }

  public String getApplicationName() {
    return mContext.getApplicationInfo().name;
  }

  @Override
  public void setView(TasksContract.TasksView tasksView) {
    mTasksView = tasksView;
  }

  @Override
  public void onStart() {
    mTasksView.setCentralText(getApplicationName());
  }
}