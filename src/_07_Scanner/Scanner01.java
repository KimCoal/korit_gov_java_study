package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner 입력받기

        Scanner scanner = new Scanner(System.in);

        // String 문자열 입력받기
        // next() > 토큰 단위로 읽는다
        // 토큰 > 공백문자 (띄어쓰기, 탭, 엔터)
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
        // hello 엔터 world 엔터로 각각 입력 하지 않아도 hello world만 입력해도 토큰단위기 때문에 두 단어를 모두 처리한다

        // nextLine() > 엔터 단위로 읽는다
//        String str3 = scanner.nextLine();
//        System.out.println("str3 = " + str3);
        // next()와는 다르게 한줄 전체를 읽는다
        
        // int 정수 입력받기
//        int num1 = scanner.nextInt();
//        System.out.println("num1 = " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("num2 = " + num2);

//        int num = scanner.nextInt();
//        scanner.nextLine(); // \n을 한번 버려주는 역할
//        String str = scanner.nextLine();
//        System.out.println("num = " + num + " str = " + str); // 123 입력후 엔터입력시 \n판정되어 str이 공백

        // 나이와 이름을 입력받아서 출력
        // > 27살 이동윤입니다

        int age;
        String name;
        System.out.print("나이를 입력해주세요 : ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("이름을 입력해주세요 : ");
        name = scanner.nextLine();

        System.out.println(age + "살 " + name + "입니다.");

    }
}