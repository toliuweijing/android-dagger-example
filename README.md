# android-dagger-example

This repository showcases an example of using Dagger with minimum code.

Here's the quick tip for starting Dagger.

* You provide Dagger a Module class that has some factory methods. See [DiModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/di/DiModule.java#L23)
* You ask Dagger to generate some factory methods in a Component interface. Then you use those methods in real code. See [TodoComponent](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplicationComponent.java#L12) and [TodoApplication](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplication.java#L28)
* Dagger will interpret your Module class and implement your Component interface. Dagger will emit compile error if she need more information from Module class.

The following steps should help walk you through the simple example.

**Step 0**, create a project(TodoApp) with empty activity([TasksActivity](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksActivity.java)) using Android Studio.

**Step 1**, read [Dagger documentations](https://github.com/google/dagger#android-gradle) and import dependencies. See here [app/build.gradle](https://github.com/toliuweijing/android-dagger-example/blob/master/app/build.gradle#L36).

**Step 2**, we can define two modules already, [TodoApplicationModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplicationModule.java) and [TasksModule](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksModule.java). 

**Step 3**, create one component for each module. [TodoApplicationComponent](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplicationComponent.java#L12) and [TasksComponent](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksComponent.java)

**Step 4**, let's create a TasksPresenter class and inject it to TasksActivity. This is done by 
* add @Inject TasksPresenter mTasksPresenter to TasksActivity. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksActivity.java#L19).
* add @Inject to TasksPresenter default constructor. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksPresenter.java)

**Step 5**, then enable activity injection. According to [documentation](https://google.github.io/dagger//android.html), you can enable activity injection by
* implement HasActivityInjector in Application class. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/TodoApplication.java#L16) 
* declare an abstract factory method in Module with @ContributesAndroidInjector annotation. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksModule.java#L26)
* call ActivityInector.inject(this), see [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksActivity.java#L26)

Now the code should run and TasksActivity should get a TasksPresenter object automatically! To go one step futher, 

**Step 6**, let's ask for a Context in TasksPresenter constrcutor. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksPresenter.java#L17)

**Step 7**, we need to tell Dagger where to get a Context. This can be done by adding a provider method to a common DiModule and then including DiModule in TasksModule. See [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/di/DiModule.java#L23) and [here](https://github.com/toliuweijing/android-dagger-example/blob/master/app/src/main/java/com/polythinking/weijingliu/todoapp/tasks/view/TasksModule.java#L19)

At this point, Context is injectable in anywhere of the app. Welcome to dependency injection.



