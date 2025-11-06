package _34_Lambda.stringProcessor;

//1. StringProcessor라는 인터페이스 만들고 process라는 추상메소드 만들기 (매개변수로 String 받음)
//2. Main에서 정적 메소드로 execute만들고 매개변수로 String input,
// 그리고 인터페이스 StringProcessor processor 받음
//3. return 으로 processor.process(input);
//4. 스캐너 하나 객체 만들기
//5. 람다식으로 구현하기 => 모두 대문자로, 모두 소문자로, 접두사로 >> 붙이기,
//      문자열 거꾸로 뒤집기 이렇게 4가지로 구현
//      접두사, 문자열 거꾸로 뒤집기 검색 ㄱㄱ
//6. 스캐너로 영문하나 입력받고 4가지 결과물 출력하기

import java.util.Comparator;
import java.util.Scanner;

public class StringProcessorMain {

    public static String execute (String input, StringProcessor s) {
        return s.process(input);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("INPUT : ");
        String input = scanner.nextLine();


        StringProcessor toUpper = (str) -> str.toUpperCase();
        StringProcessor toLower = (str) -> str.toLowerCase();
//        StringProcessor plusHead = (str) -> ">>" + str;
        StringProcessor plusHead = (str) -> new StringBuilder(">>").append(str).toString();
        StringProcessor reverseOrder = (str) -> new StringBuilder(str).reverse().toString();
//        reverse()는 String이 아니라 StringBuilder를 반환하니까, 사용하려면 toString()으로 String으로 바꿔야 한다

        System.out.println("대문자로 : " + execute(input, toUpper));
        System.out.println("소문자로 : " + execute(input, toLower));
        System.out.println(">> 접두사 붙이기 : " + execute(input, plusHead));
        System.out.println("뒤집기 : " + execute(input, reverseOrder));






    }

}
