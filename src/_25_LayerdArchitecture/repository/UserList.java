package _25_LayerdArchitecture.repository;

import _25_LayerdArchitecture.entity.User;

public class UserList {
    private User[]  users;

    public UserList() {
        this.users = new User[0];
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
