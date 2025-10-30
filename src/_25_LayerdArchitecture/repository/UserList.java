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

    public int generateUserId() {
        // 만약 user 배열에 아무것도 없으면 1반환
//        if (users.length == 0) return 1;
        // 있으면 마지막 user객체의 userId에 +1 한 결과값을 반환
//        return users[users.length - 1].getUserId() + 1;
        // users배열의 마지막 요소에서 userid를 꺼내와서 거기다 1을 더한다
        // 삼항연산자?
        return (users.length == 0) ? 1 : users[users.length - 1].getUserId() + 1;
    }

    public void add (User user) {
        // 새로 넣을 배열 > 길이 ? > 원래 있던 배열에서 + 1
        // 새로 넣을 배열에 원래 있던 요소들 추가
        // 새로 추가할 user를 넣어야함
        // users에 있던 배열에서 새로운 배열로 바꾸기
        User[] newUsers = new User[users.length + 1];

        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }

        newUsers[users.length] = user;

        users = newUsers;

    }
}
