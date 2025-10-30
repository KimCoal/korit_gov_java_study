package _25_LayerdArchitecture.dto;

import _25_LayerdArchitecture.entity.Todo;
import _25_LayerdArchitecture.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class TodoRegisterReqDto {
    private String content;
    private User user;

    public Todo todoReg() {
        return Todo.builder()
                .todoId(0)
                .content(content)
                .user(user)
                .createDt(LocalDateTime.now())
                .build();
    }
}
