package com.polythinking.weijingliu.todoapp.tasks.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.polythinking.weijingliu.todoapp.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Main activity for tasks screen.
 */
public class TasksActivity extends AppCompatActivity implements TasksContract.TasksView {

  // Dependencies
  @Inject TasksViewPresenter mViewPresenter;

  // Subviews
  private TextView mCenterTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    AndroidInjection.inject(this);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mCenterTextView = (TextView) findViewById(R.id.text_view);

    mViewPresenter.setView(this);
  }

  @Override
  public void setCenterText(String text) {
    mCenterTextView.setText(text);
  }

  @Override
  protected void onStart() {
    super.onStart();
    mViewPresenter.onStart();
  }
}
