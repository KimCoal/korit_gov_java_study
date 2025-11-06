package _35_StreamApi;

/*
* 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
* 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행
*
* 간결성
* 메소드 체이닝으로 인한 가독성 향상 및 간결해짐
* 함수형 프로그래밍
* */

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이","김삼", "김사", "최영", "최일", "최이", "박영", "박일");

        // filter() > 말그대로 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();

        System.out.println("namesWithKim = " + namesWithKim);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map() > 내부 요소들에게 각각 메소드를 적용하는 형태
        List<Integer> multiNumbers = numbers.stream()
                .map(num -> num*2)
                .toList();
        System.out.println("multiNumbers = " + multiNumbers);

        List<String> englishNames = Arrays.asList("alice", "ally", "aris", "bob", "sam", "swan", "charlie", "chals", "alejandro", "charlotte");

        // a로 시작하는 애들로 거르고 모두 다 대문자
        List<String> result = englishNames.stream()
                .filter(n -> n.startsWith("a"))
                .map(String::toUpperCase) // n -> n.toUpperCase()
                // ::은 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용 > method reference
                .sorted()
                .toList();

        System.out.println(result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);

        // englishName에서 이름이 5글자 초과 되는 이름의 갯수
        // 일반적으로 for문
        // 스트링을 이용한 결과

        int count = 0;
        for (String name : englishNames) {
            if(name.length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        long result1 = englishNames.stream()
                .filter(name -> name.length() > 5)
                .count();
        System.out.println(result1);
    }
}
