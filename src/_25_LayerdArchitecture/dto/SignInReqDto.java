package _25_LayerdArchitecture.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignInReqDto {
    private String username;
    private String password;
}
