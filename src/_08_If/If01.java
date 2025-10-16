package _08_If;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        // 조건문 > if문
        /*
        * if (조건) {
        *   해당 조건이 참일때 실행될 코드
        * }
        * */

        int height = 140;
        // 키가 120 이상이면 탑승 가능 출력
        if (height >= 120) System.out.println("탑승 가능"); // 간단한 조건문 같은 경우 {} 생략 가능
        else System.out.println("탑승 불가능");

        // 키가 120이상이면서 어린이인 경우만 탑승가능
        boolean isKid = true;
        if (height >= 120 && isKid) System.out.println("탑승 가능");
        else System.out.println("탑승 불가능");

        // 키가 120이상 이거나 어린이인 겨우 탑승가능
        if (height >= 120 || isKid) System.out.println("탑승가능");
        else System.out.println("탑승 불가능");

        // 3의배수인지 판단
        int num = 12;
        // 3의 배수이면 3의 배수입니다. 출력
        if (num % 3 ==0) System.out.println("3의 배수입니다");

        // 절대값 출력
        int num2 = -12;
        // 절대값 출력
        if (num2 < 0) System.out.println("절대값은 " + (-num2));
        else System.out.println("절대값은 " + num2);

        // 최대값 출력
        int num3 = 12;
        int num4 = 8;
        if (num3 > num4) System.out.println("최대값은 " + num3);
        else System.out.println("최대값은 " + num4);

        // 아이디 비밀번호 확인
        String userId = "myid1234";
        String userPw = "qwer1234";
        // 사용자에게 아이디 비밀번호를 입력받아 일치하면
        // 로그인 확인 출력
        // 아이디가 틀리면 아이디가 틀렸습니다
        // 비밀번호가 틀리면 비밀번호가 틀렸습니다
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 : ");
        String inputId = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요 : ");
        String inputPw = scanner.nextLine();

//        if (inputId.equals(userId)){
//            if (inputPw.equals(userPw)){
//                System.out.println("로그인 확인");
//            } else {
//                System.out.println("비밀번호가 틀렸습니다");
//            }
//        } else {
//            System.out.println("아이디가 틀렸습니다");
//        }

        if (!inputId.equals(userId))
            System.out.println("아이디가 틀렸습니다.");
        if (inputId.equals(userId) && !inputPw.equals(userPw))
            System.out.println("비밀번호가 틀렸습니다.");
        if (inputId.equals(userId) && inputPw.equals(userPw))
            System.out.println("로그인 확인");

    }
}
