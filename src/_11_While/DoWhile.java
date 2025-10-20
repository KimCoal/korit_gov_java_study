package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 = Do While
        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 최초 1회는 실행
        // while은 조건 검사 후 실행

        /*
         * do {
         *   반복할 코드 -- 최초 한번은 실행
         * } while (조건);
         * */

        int i = 10; // while문의 조건에 부합하지 않아도 처음 한번은 실행하기 때문에 결과값으로 10 출력
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

//        int choice;
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("===== Menu =====");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("0. 종료");
//            System.out.println("================");
//            System.out.print("메뉴를 선택해주세요 : ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("주문을 합니다.");
//                    break;
//                case 2:
//                    System.out.println("취소합니다.");
//                    break;
//                case 0:
//                    System.out.println("종료합니다.");
//                    break;
//                default:
//                    System.out.println("올바른 번호를 입력하세요");
//            }
//        } while (choice != 0);

        // 1부터 n까지 합을 do while

//        int sum = 0;
//        int n;
//
//        System.out.print("n을 입력하세요 : ");
//        n = scanner.nextInt();
//
//        do {
//            sum += n;
//            n--;
//        } while (n != 0);
//
//        System.out.println(sum);

        // 숫자 맞추기 게임
        int answer = (int)(Math.random() * 100) + 1;
        // 숫자를 입력받아서 정답을 맞추기
        // 업 다운 출력
        // 시도한 횟수를 나중에 정답 맞췄을때 같이 출력

        int guess;
        int doQuiz = 0;

        do {
            System.out.print("숫자를 입력해주세요 : ");
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("1부터 100까지의 정수만 입력할 수 있습니다.");
            } else if (guess < answer) {
                System.out.println("업");
            } else if (guess > answer) {
                System.out.println("다운");
            }
            doQuiz++;

        }while (guess != answer);

        System.out.println("정답은 : " + answer);
        System.out.println("시행 횟수는 : " + doQuiz + "회 입니다.");

    }
}
