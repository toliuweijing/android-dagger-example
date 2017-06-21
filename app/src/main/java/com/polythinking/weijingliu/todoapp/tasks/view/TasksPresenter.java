package com.polythinking.weijingliu.todoapp.tasks.view;

import android.content.Context;

import javax.inject.Inject;

/**
 * Controller for tasks view.
 */
public class TasksPresenter implements TasksContract.TasksPresenter {

  private final Context mContext;

  private TasksContract.TasksView mTasksView;

  @Inject
  public TasksPresenter(Context context) {
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
    mTasksView.setCenterText(getApplicationName());
  }
}
