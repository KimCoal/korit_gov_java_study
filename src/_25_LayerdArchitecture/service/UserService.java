package _25_LayerdArchitecture.service;


import _25_LayerdArchitecture.dto.SignUpReqDto;
import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.repository.UserList;


public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    // username 중복확인
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }

    // 회원가입
    public void signUp(SignUpReqDto signUpReqDto) {
        // 1. signUpReqDto > user(entity)
        User user = signUpReqDto.toUser();
        // 2. userId 생성
        user.setUserId(userList.generateUserId());
        // 3. user 배열에 추가
        userList.add(user);
    }
}


