package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // 반복문 - While
        // 조건이 참일 경우 계속 반복
        // for문과 차이
        // for문 횟수 중심, while문 조건 중심
        /*
        * while (조건) {
        *   반복할 코드
        * }
        * */

        int i = 1;

        while (i <= 5){
            System.out.println(i);
            i++; // 조건을 변경하기 위한 코드 필요
        }

        i = 10;
        while (i >= 1){
            System.out.println(i);
            i--; // 조건을 변경하기 위한 코드 필요
        }

        // 짝수만 출력 1~10까지

        int num = 1;
        while (num <= 10){
            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        // 점수를 입력한다 0~100
//        while (flag) {
//            System.out.print("점수를 입력하세요 : ");
//            int score = scanner.nextInt();
//
//            if (score >= 0 && score <= 100){
//                System.out.println(score + "점");
//                flag = false; // break;
//            } else {
//                System.out.println("점수를 다시 입력하세요");
//            }
//        }

//        int menu;
//        while (flag) {
//            System.out.println("메뉴를 선택하세요");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("3. 재주문하기");
//            System.out.print("메뉴를 고르세요 : ");
//
//            menu = scanner.nextInt();
//            switch (menu) {
//                case 1 :
//                    System.out.println("메뉴 주문하기");
//                    break;
//                case 2 :
//                    System.out.println("취소하기");
//                    break;
//                case 3 :
//                    System.out.println("재주문하기");
//                    break;
//                default:
//                    System.out.println("다시 입력해주세요");
//                    continue;
//            }
//            break;
//
//        }
        // 1부터 100까지 누적합
        int sum = 0;
        int num1 = 1;
        while (num1 <= 100) {
            sum += num1;
            num1++;
        }
        System.out.println(sum);

        // 1번부터 100번까지 식당 웨이팅
        // 이때 1번부터 차례대로 입장 > **번 손님 입장 ! 출력
        // 10번 손님이 입장할때 한정메뉴가 솔드아웃
        // 솔드아웃 되었기 때문에 가게 문닫음
        // 마지막엔 영업종료 출력



        // 1번부터 50번까지 웨이팅
        // 메뉴가 20개까지만 한정판매 > 솔드아웃 가게 샷다 내림 출력
        // 이때 14번이 노쇼 > *번 노쇼 발생 ! 출력
        // while문으로



    }
}
