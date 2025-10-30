package _25_LayerdArchitecture.view;

import _25_LayerdArchitecture.dto.SignUpReqDto;
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
                if (principle == null) {
                    System.out.println("로그인 후 사용 가능합니다");
                    continue;
                    // while의(반복문의) 처음으로 돌아가서 다시 반복 실행
                }
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

    // 회원가입 뷰 (프론트 엔드)
    void signUpView() {
        System.out.println("[ 회원가입 ]");

        // 중복확인
        String username = null;
        while(true) {
            System.out.print("username : ");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) { // 중복이 되지 않았을때
                System.out.println("사용가능한 아이디(username) 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username입니다.");
        }

        System.out.print("password : ");
        String password = scanner.nextLine();

        System.out.println("name : ");
        String name = scanner.nextLine();

        SignUpReqDto signUpReqDto = new SignUpReqDto(username, password, name);
        //userService의 회원가입 로직에 signupReqDto 전달
        userService.signUp(signUpReqDto);




    }
}

