package _25_LayerdArchitecture.repository;

import _25_LayerdArchitecture.entity.Todo;
import _25_LayerdArchitecture.entity.User;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public int generateTodoId() {
        return (todos.length == 0) ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }

    public void add (Todo todo) {

        Todo[] newTodos = new Todo[todos.length + 1];

        for (int i = 0; i < todos.length; i++) {
            newTodos[i] = todos[i];
        }

        newTodos[newTodos.length - 1] = todo;

        todos = newTodos;

    }

    public Todo[] findByUserName(User user) {
        int count = 0;
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) count++;
        }
        // todos에서 user가 로그인한 유저랑 똑같은 principle을 가지는 것의 수를 샌다음

        Todo[] result = new Todo[count];
        // 위에서 샌 count크기만큼의 배열을 다시 만든다
        // 그 배열에 다시 반복문으로 todos에 있던 리스트를 저장해준다
        int idx = 0;
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                result[idx++] = todo;
            }
        }
        return result;
    }
}
