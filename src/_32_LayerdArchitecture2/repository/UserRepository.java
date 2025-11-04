package _32_LayerdArchitecture2.repository;

import _32_LayerdArchitecture2.entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUserName(String username);
}
