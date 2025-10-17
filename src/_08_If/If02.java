package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        // if else if
        /*
        * if (조건1) {
        *   조건1이 참일때
        * } else if (조건2) {
        *   조건2가 참일때
        * } else {
        *   조건1과 조건2가 모두 거짓일때
        * }
        *
        * */

        int avgScore = 77;
        /*
        * 90점 이상 A
        * 80점 이상 B
        * 70점 이상 C
        * 나머지 D
        * */
        if (avgScore >= 90) {
            System.out.println("A");
        } else if (avgScore >= 80) {
            System.out.println("B");
        } else if (avgScore >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // 사분면
        // x 와 y 를 입력 받으세요
        // 입력했을때 몇 사분면에 존재하는지 출력하시오

        Scanner scanner = new Scanner(System.in);
        System.out.print("x 값을 입력하세요 : ");
        int x = scanner.nextInt();
//        scanner.nextLine();
//        nextInt 다음에 nextLine을 쓸때 \n을 버리는것 nextLine은 엔터를 읽지만
//        nextInt는 엔터 스페이스 등을 무시하고 정수만 읽는다
        System.out.print("y 값을 입력하세요 : ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0){
            System.out.println("3사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("4사분면");
        } else if (x == 0 && y == 0) {
            System.out.println("원점");
        } else if (x == 0) {
            System.out.println("y축 위에 위치");
        } else {
            System.out.println("x축 위에 위치");
        }
    }
}
