package _25_LayerdArchitecture;

import _25_LayerdArchitecture.repository.UserList;
import _25_LayerdArchitecture.service.UserService;
import _25_LayerdArchitecture.view.TodoListView;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoListView todoListView = new TodoListView(userService);

        todoListView.homeView();

    }
}
