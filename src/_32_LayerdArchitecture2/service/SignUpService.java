package _32_LayerdArchitecture2.service;

import _32_LayerdArchitecture2.dto.SignUpReqDto;
import _32_LayerdArchitecture2.entity.User;
import _32_LayerdArchitecture2.repository.UserRepository;
import _32_LayerdArchitecture2.repository.UserRepositoryImpl2;

public class SignUpService {
    private UserRepository userRepository;

    private static SignUpService instance;

    private SignUpService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignUpService getInstance() {
        if (instance == null) {
            instance = new SignUpService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUserName(username);
        if (foundUser != null) {
            return false;
        }
        return true;
    }

    public void signup(SignUpReqDto signUpReqDto) {
        userRepository.insert(signUpReqDto.toEntity());
    }

    public boolean isValidPassword(String password) {
        return password != null && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) return false;
        return password.equals(confirmPassword);
    }
}

