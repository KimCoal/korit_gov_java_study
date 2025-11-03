package _29_Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    // Collection
    // 여러 객체를 모아놓는 것

    // List - 순서가 있는 데이터의 집함, 중복된 요소를 허락한다.
    public static void main(String[] args) {
//        List<String> stringList1 = new ArrayList<>();
//
//        // 요소 추가
//        stringList1.add("A");
//        stringList1.add("B");
//        stringList1.add("A"); // 중복 허용
//        stringList1.add("C");
//        stringList1.add("D");
//
//        System.out.println(stringList1);

        List<String> stringList1 = new ArrayList<>(Arrays.asList("A","B","C","A")); // 선언과 동시에 추가
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Java");
        stringList2.add("Python");
        stringList2.add("C#");
        stringList2.add("JavaScript");
        stringList2.add("Kotlin");

//        String[] str1 = new String[2];
//        str1[0] = "Java";
//        str1[1] = "JavaS";
//        System.out.println(str1[0]);

        System.out.println(stringList2.get(0));
        System.out.println(stringList2);

        // 특정 요소의 포합 여부 > contains()
        String searchElem1 = "Python";
        boolean containsRes = stringList2.contains(searchElem1);
        System.out.println("containsRes = " + containsRes);

        String searchElem2 = "py";
        boolean containsRes1 = stringList2.contains(searchElem2);
        System.out.println("containsRes1 = " + containsRes1);

        String email = "ex123@gmail.com";
        boolean containsRes2 = email.contains("@");
        System.out.println("containsRes2 = " + containsRes2);

        // 요소 삭제
        String removeElem1 = "Kotlin";
        boolean removeRes1 = stringList2.remove(removeElem1);
        System.out.println("removeRes1 = " + removeRes1);

        // 오름차순 정렬
        Collections.sort(stringList2);
        System.out.println("stringList2 = " + stringList2);

        // 내림차순 정렬
        Collections.sort(stringList2, Collections.reverseOrder());
        System.out.println("stringList2 = " + stringList2);

        // 리스트의 길이 구하기
        System.out.println(stringList2.size());

        // python 언어, javascript언어
        // 일반 for문을 이용해서 뒤에 다 언어 붙여서 출력

        System.out.println(">>> for문");

        for (int i = 0; i < stringList2.size(); i++) {
            System.out.println(stringList2.get(i) + " 언어");
        }

        System.out.println(">>> for - each문");

        for (String str : stringList2) {
            System.out.println(str + " 언어");
        }

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

    }
}
