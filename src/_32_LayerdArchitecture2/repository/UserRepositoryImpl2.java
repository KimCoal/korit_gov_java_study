package _32_LayerdArchitecture2.repository;

import _32_LayerdArchitecture2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl2 implements UserRepository{
    private static UserRepositoryImpl2 instance;
    List<User> users;
    private int autoIncrementId;

    private UserRepositoryImpl2() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl2 getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl2();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        user.setUserId(autoIncrementId++);
        users.add(user);
    }

    @Override
    public User findByUserName(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
