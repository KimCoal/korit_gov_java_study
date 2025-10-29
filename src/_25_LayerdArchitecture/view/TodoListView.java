package _25_LayerdArchitecture.view;

import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principle;
    private UserService userService;

    public TodoListView(UserService userService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
    }

    public void homeView() {
        while(true) {
            System.out.println("[ Todo List ]");
            System.out.println("================");
            System.out.println("1. todoList");
            if (principle == null){
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.println("================");
            System.out.print(">>> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                // todoList 관리
            } else if ("2".equals(cmd) && principle == null) {
                // 회원가입
            } else if ("2".equals(cmd) && principle != null) {
                // 로그아웃
            } else if ("3".equals(cmd) && principle == null) {
                // 로그인
            } else {
                System.out.println("잘못입력하였습니다");
            }

        }
    }

    // 회원가입 뷰
    void signUpView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while (true) {
            System.out.print("username : ");
            username = scanner.nextLine();

        }
    }
}
