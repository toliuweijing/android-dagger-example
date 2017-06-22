# android-dagger-example

This repository showcases an example of using dagger with minimum code.

Step 0, create a project(TodoApp) with empty activity([TasksActivity](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksActivity.java)) using Android Studio.

Step 1, read [Dagger documentations](https://github.com/google/dagger#android-gradle) and import both dagger and dagger-android dependencies to build.gradle. Just like [app/build.gradle](https://github.com/toliuweijing/android-dagger-example/blob/master/app/build.gradle#L36).
```
    // dagger
    compile 'com.google.dagger:dagger-android:2.11'
    compile 'com.google.dagger:dagger-android-support:2.11'
    annotationProcessor 'com.google.dagger:dagger-android-processor:2.11'
    compile 'com.google.dagger:dagger:2.11'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.11'
```

Step 2, we can define two modules already, [TodoApplicationModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplicationModule.java) and [TasksModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksModule.java). TodoApplicationModule represents the whole todo application. It can selectedly [install TasksModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplicationModule.java#L11) to ship along the app. TasksModule represents a single feature. It's independent to any application module so it's reusable to all apps. 
