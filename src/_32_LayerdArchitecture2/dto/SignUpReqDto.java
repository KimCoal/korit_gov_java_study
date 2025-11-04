package _32_LayerdArchitecture2.dto;

import _32_LayerdArchitecture2.entity.User;
import _32_LayerdArchitecture2.util.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpReqDto {
    private String username;
    private String password;
    private String ConfirmPassword;

    public User toEntity() {
        return User.builder()
                .userId(0)
                .username(username)
                .password(PasswordEncoder.encode(password))
                .build();
    }
}
