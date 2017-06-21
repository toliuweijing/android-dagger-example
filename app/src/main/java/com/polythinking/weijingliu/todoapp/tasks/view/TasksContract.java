package com.polythinking.weijingliu.todoapp.tasks.view;

/**
 * contract for tasks view
 */
public class TasksContract {

  public interface TasksView{

    /**
     * set text to display at center.
     */
    void setCenterText(String string);
  }

  public interface TasksPresenter {

    /**
     * set tasks view.
     */

    void setView(TasksView tasksView);

    /**
     * when activity is onStart().
     */
    void onStart();
  }
}
