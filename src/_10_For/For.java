package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        /*
        * for (선언부; 조건; 증감) {
        *   반복할 코드
        * }
        * */
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        for (int i = 0; i <= 50 ; i += 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//        // 1부터 100까지 다 더한 총합을 구하시오
//
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("총합 : " + sum);

        // 1부터 100까지 중에 짝수만 더한 총합을 구하시오

//        int sum1 = 0;
//        for (int i = 2; i <= 100 ; i += 2) {
//            sum1 += i;
//            System.out.println("sum1 = " + sum1);
//        }
//        System.out.println("sum1 = " + sum1);

        // 구구단 출력하기 (한 단만)
        // 특정 단을 입력받아서 1~9까지 구구단 출력하기

        Scanner scanner = new Scanner(System.in);

//        System.out.print("단을 입력하세요 : ");
//        int x = scanner.nextInt();
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(x + "*" + i);
//        }

        // 구구단 전체 출력하기
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(j + "*" + i + "=" + (j * i) + "  ");
//            }
//            System.out.println();
//        }

        /*
        * *
        * **
        * ***
        * ****
        * *****
        * */

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // break, continue

        for (int i = 1; i < 10; i++) {
            if (i == 5) continue;
            if (i == 7) break;
            System.out.println(i);
        }

        // 1~50까지 수 중에서 3의 배수 빼고 출력하기
        // 단 3의 배수는 " " 띄어쓰기 한칸 출력으로 대체

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(" ");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("==============================");

        // 1부터 계속 합계를 구하되 합계가 200이 넘어가면 스탑
        // 마지막은 최종 합과 마지막으로 더한 수를 출력

//        int sum = 0;
//        int i;
//        for (i = 1; ; i++) {
//            sum += i;
//            if (sum > 200) {
//                break;
//            }
//        }
//        System.out.println("끝 " + sum + " (마지막으로 더한 수: " + i + ")");

        // 1부터 100까지 수 중에서 3의배수와 5의 배수의 갯수를 각각 출력하시오
//        System.out.println("==============================");
//        int count3 = 0; // 3의 배수 개수
//        int count5 = 0; // 5의 배수 개수
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                count3++;
//            }
//
//            if (i % 5 == 0) {
//                count5++;
//            }
//
//            if (i == 100) { // 100까지 돌면 멈춤
//                break;
//            }
//
//        }
//
//        System.out.println("3의 배수 개수: " + count3);
//        System.out.println("5의 배수 개수: " + count5);
        System.out.println("==============================");

        // 정수 5개를 입력받고 입력받은 수 중 가장 큰 값 출력
        // 범위는 1에서 100사이 만약 1에서 100사이가 아니라면
        // 범위를 벗어났습니다 출력 후 스탑

//        int max = 0;
//        int num;
//
//        for (int i = 1; i <= 5; i++){
//            System.out.print(i + " 번째 정수를 입력해주세요 : ");
//            num = scanner.nextInt();
//
//            if (num < 1 | num > 100){
//                System.out.println("범위를 벗어났습니다");
//                break;
//            }
//
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println("최대값은 : " + max);

        // 팩토리얼 구하기
        // 숫자를 입력받아 팩토리얼 구하기
        // 단 1~10까지만 입력받기

//        System.out.print("팩토리얼을 구할 숫자 입력 : ");
//        int fac = scanner.nextInt();
//
//        if (fac < 1 || fac > 10){
//            System.out.println("범위를 벗어났습니다");
//            return;
//        }
//
//        int result = 1;
//        String str = "";
//        for (int i = 1; i <= fac; i++) {
//            result *= i;
//            str += i;
//            if (i < fac) str += "*";
//        }
//        System.out.println(str);
//        System.out.println(result);

        // 1~50까지 반복하는데
        // 3 6 9 일때는 박수
        // 5일때는 으악

//        for (int i = 1; i <= 50; i++){
//            if (i % 10 == 3){
//                System.out.print("박수 ");
//                continue;
//            }
//            if (i % 10 == 6){
//                System.out.print("박수 ");
//                continue;
//            }
//            if (i % 10 == 9){
//                System.out.print("박수 ");
//                continue;
//            }
//            if (i % 10 == 5){
//                System.out.print("으악 ");
//                continue;
//            }
//            System.out.print(i + " ");
//        }

        // 문제오류 30 부터 39는 항상 박수에 33 36 39는 박수 2번 50은 으악 2번
        // 해결

        for (int i = 1; i <= 50; i++) {
            boolean flag = true;
            if (i % 10 == 3 || i % 10 ==6 || i % 10 == 9) {
                System.out.print("박수 ");
                flag = false;
            } else if (i % 10 == 5) {
                System.out.print("으악 ");
                flag = false;
            }
            if (i / 10 ==3) {
                System.out.print("박수 ");
                flag = false;
            }
            if (i == 50) {
                System.out.print("으악 ");
                flag = false;
            }
            if (flag){
                System.out.print(i + " ");
            }
        }
    }
}
