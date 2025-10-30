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
public class SignUpReqDto {
    private String username;
    private String password;
    private String name;

    public User toUser() {
        return User.builder()
                .userId(0)
                .username(username)
                .password(password)
                .name(name)
                .build();
    }


}
