package _25_LayerdArchitecture.view;

import _25_LayerdArchitecture.dto.SignInReqDto;
import _25_LayerdArchitecture.dto.SignUpReqDto;
import _25_LayerdArchitecture.dto.TodoRegisterReqDto;
import _25_LayerdArchitecture.entity.Todo;
import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.service.TodoService;
import _25_LayerdArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principle;
    private UserService userService;
    private TodoService todoService;

    public TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
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
                todoListMenu();
                if (principle == null) {
                    System.out.println("로그인 후 사용 가능합니다");
                    continue;
                    // while의(반복문의) 처음으로 돌아가서 다시 반복 실행
                }
            } else if ("2".equals(cmd) && principle == null) {
                // 회원가입
                signUpView();
            } else if ("2".equals(cmd) && principle != null) {
                // 로그아웃
                principle = null;
                System.out.println("로그아웃 성공");
            } else if ("3".equals(cmd) && principle == null) {
                // 로그인
                signInView();
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
            // 나중에 공백이나 null이 들어가면 안되게 고쳐보기
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) { // 중복이 되지 않았을때
                System.out.println("사용가능한 아이디(username) 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username입니다.");
        }

        System.out.print("password : ");
        String password = scanner.nextLine();

        System.out.print("name : ");
        String name = scanner.nextLine();

        SignUpReqDto signUpReqDto = new SignUpReqDto(username, password, name);
        //userService의 회원가입 로직에 signupReqDto 전달
        userService.signUp(signUpReqDto);
        System.out.println("================");
        System.out.println("회원가입 완료");
        // 조회할 수 있는 로직 추가
        userService.printAllUserList();


    }

    void signInView() {
        System.out.println("[ 로그인 ]");
        System.out.print("username : ");
        String username = scanner.nextLine();

        System.out.print("password : ");
        String password = scanner.nextLine();

        SignInReqDto signInReqDto = new SignInReqDto(username, password);

        User loginUser = userService.signIn(signInReqDto);

        if (loginUser == null) {
            System.out.println("username이나 password를 다시 확인해주세요");
        } else {
            principle = loginUser;
            System.out.println("로그인 성공");
        }
    }

    void todoListMenu() {
        while (true) {
            System.out.println("[ todoList Menu ]");
            System.out.println("1. todo 등록");
            System.out.println("2. todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">>> ");

            String cmd = scanner.nextLine();

            if("b".equals(cmd)) break;
            else if ("1".equals(cmd)) {
                todoRegisterView();
            } else if ("2".equals(cmd)) {
                todoListView();
            }
        }
    }

    // todo 등록
    void todoRegisterView() {
        if(principle == null) {
            System.out.println("로그인 후 사용가능합니다");
            return;
        }
        System.out.println("[ todo 등록 ]");
        String todo = scanner.nextLine();

        TodoRegisterReqDto todoRegisterReqDto = new TodoRegisterReqDto(todo, principle);
        todoService.todoReg(todoRegisterReqDto);

        System.out.println("todo 등록 완료");
    }

    // todo 조회
    void todoListView() {
        if(principle == null) {
            System.out.println("로그인 후 사용가능합니다");
            return;
        }
        System.out.println("[ todo 조회 ]");
        Todo[] myTodo = todoService.viewMyTodo(principle);

        if(myTodo.length == 0) {
            System.out.println("등록되어있는 todo리스트가 없습니다");
            return;
        }

        for (Todo todo : myTodo) {
            System.out.println(todo);
        }
    }
}

