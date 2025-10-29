package _25_LayerdArchitecture.dto;

import _25_LayerdArchitecture.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class TodoRegisterDto {
    private String content;
    private User user;
}
