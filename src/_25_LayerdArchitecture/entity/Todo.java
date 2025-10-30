package _25_LayerdArchitecture.entity;

import lombok.*;

import java.time.LocalDateTime;



@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {
    private int todoId;
    private String content;
    private User user;
    private LocalDateTime createDt;
}
