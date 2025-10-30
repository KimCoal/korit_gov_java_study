package _25_LayerdArchitecture.service;

import _25_LayerdArchitecture.dto.SignUpReqDto;
import _25_LayerdArchitecture.dto.TodoRegisterReqDto;
import _25_LayerdArchitecture.entity.Todo;
import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.repository.TodoList;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    // todo 등록
    public void todoReg(TodoRegisterReqDto todoRegisterReqDto) {
        Todo todo = todoRegisterReqDto.todoReg();
        todo.setTodoId(todoList.generateTodoId());
        todoList.add(todo);
    }

    // todo 조회
    public Todo[] viewMyTodo(User user) {
        // principle을 전달받아서 findByUserName에서 받아서
        // repository에서
        return todoList.findByUserName(user);

    }
}
