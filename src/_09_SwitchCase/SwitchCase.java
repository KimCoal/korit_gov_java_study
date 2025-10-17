package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Switch
        // break를 만날때까지 계속 실행

        // ranking > 1 = 전액 장학금 출력
        // 2 = 반액 장학금 출력
        // 3 = 소정의 상금
        // 그 이하 > 박수

        int ranking = 1;

//        if (ranking == 1) {
//            System.out.println("전액 장학금");
//        } else if (ranking == 2) {
//            System.out.println("반액 장학금");
//        } else if (ranking == 3) {
//            System.out.println("소정의 상금");
//        } else {
//            System.out.println("박수");
//        }
//
//        switch (ranking) {
//            case 1 :
//                System.out.println("전액 장학금");
//                break;
//            case 2 :
//                System.out.println("반액 장학금");
//                break;
//            case 3 :
//                System.out.println("소정의 상금");
//                break;
//            default:
//                System.out.println("박수");
//                break;
//        }

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 : // 2에서 멈추지 않고 바로 3으로 가서 출력 후 브레이크
            case 3 :
                System.out.println("소정의 상금");
                break;
            default:
                System.out.println("박수");
                break;
        }

        int grade = 2;
        int price = 7000;
        // 1등급은 10000, 등급이 낮아질수록 -1000

        // 1 - 100000
        // 2 - 9000
        // 3 - 8000

        switch (grade) {
            case 1 : price += 1000;
            case 2 : price += 1000;
            case 3 : price += 1000;
            break;
        }
        System.out.println("price = " + price);

        // 월을 입력받고 (int)
        // 3,4,5 > Spring 출력
        // 6,7,8 > Summer 출력
        // 9,10,11 > Autumn 출력
        // 12,1,2 > Winter 출력

        Scanner scanner = new Scanner(System.in);
//
//        int month;
//
//        System.out.print("달을 입력해주세요 :");
//
//        month = scanner.nextInt();
//
//        switch (month) {
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("Spring");
//                break;
//            case 6 :
//            case 7 :
//            case 8 :
//                System.out.println("Summer");
//                break;
//            case 9 :
//            case 10 :
//            case 11 :
//                System.out.println("Autumn");
//                break;
//            case 12 :
//            case 1 :
//            case 2 :
//                System.out.println("Winter");
//                break;
//            default:
//                System.out.println("1부터 12까지의 수만 입력할 수 있습니다");
//                break;
//        }
        // 숫자 a를 입력받고
        // 연산자 기호를 입력받고 (+, -, *, /) !> 유효한 기호가 아닙니다
        // 숫자 b를 입력받는다

        int a;
        String cal;
        int b;

        System.out.print("숫자 a를 입력하세요 : ");
        a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("연산자 기호를 입력하세요 : ");
        cal = scanner.nextLine();

        System.out.print("숫자 b를 입력하세요 : ");
        b = scanner.nextInt();

        int result = 0;
        boolean valid = true;

        switch (cal) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0){
                    result = a / b;
                } else {
                    System.out.println("0으로 나눌수 없습니다");
                    valid = false;
                }
                break;
            default:
                System.out.println("유효한 연산자가 아닙니다");
                break;
        }
        if (valid) {
            System.out.println("결과는 " + result + " 입니다.");
        }



    }
}
