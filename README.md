# android-dagger-example

This repository showcases an example of using dagger with minimum code.

Step 1, read [Dagger documentations](https://github.com/google/dagger#android-gradle) and import both dagger and dagger-android dependencies to build.gradle. Just like [app/build.gradle](https://github.com/toliuweijing/android-dagger-example/blob/master/app/build.gradle#L36).
```
    // dagger
    compile 'com.google.dagger:dagger-android:2.11'
    compile 'com.google.dagger:dagger-android-support:2.11'
    annotationProcessor 'com.google.dagger:dagger-android-processor:2.11'
    compile 'com.google.dagger:dagger:2.11'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.11'
```

Step 2, the project contains nothing but a single [TasksActivity](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksActivity.java). It's no better time than day one to enforce modularity! There're already two modules, ApplicationModule and TasksModule. Logically ApplicationModule represents the whole app that requires TasksModule as its dependency. 
