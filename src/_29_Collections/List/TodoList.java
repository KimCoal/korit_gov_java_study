package _29_Collections.List;

/*
 * TodoList
 * todoList 를 담을 리스트 생성
 * 사용자한테 투두를 입력받을건데 몇개 입력할건지 count변수에 입력받기
 * count만큼 반복해서 사용자에게 투두입력받아 리스트에 추가
 * 향상된 for문을 사용해서 할 일 목록 쭉 출력
 * 목록 출력 뒤 특정 투두를 포함여부를 확인하기 위해서 searchTodo라는 변수에
 * 찾을 투두 입력받기 그리고 포함여부 확인후 여부 출력
 * 포함여부 확인 후 삭제할 투두를 입력받아 삭제하기
 * 투두들을 오름차순 정렬후 전체 출력
 * 이번에는 투두들을 내림차순 정렬후 전체 출력
 * 전체 투두들의 갯수 출력하기
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇개의 todo를 입력할까요 ?");
        System.out.print(">>> ");

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 todo ");
            System.out.print(">>> ");
            String getTodo = scanner.nextLine();
            todoList.add(getTodo);
        }

        System.out.println(" Todo 리스트 전체 출력 ");

        for (String showTodo : todoList) {
            System.out.println(showTodo);
        }

        System.out.println("찾을 Todo 입력받기");
        System.out.print(">>> ");
        String searchTodo = scanner.nextLine();

        System.out.println(todoList.contains(searchTodo));

        System.out.println("삭제할 todo 입력받기");
        System.out.print(">>> ");
        String deleteTodo = scanner.nextLine();
        todoList.remove(deleteTodo);

        System.out.println("todo리스트 오름차순 정렬");
        Collections.sort(todoList);
        System.out.println(todoList);

        System.out.println("todo리스트 내림차순 정렬");
        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println(todoList);

        System.out.println("리스트의 크기 출력");
        System.out.println(todoList.size());

    }
}
