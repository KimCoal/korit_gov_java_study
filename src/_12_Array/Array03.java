package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 정렬
        Integer[] nums = {1, 5, 2, 7, 8, 3, 9, 10};
        System.out.println(Arrays.toString(nums));

        // sort()
        Arrays.sort(nums); // 오름차순 정렬
        System.out.println(Arrays.toString(nums));

//        int[] reversed = new int[nums.length];
//
//        int k = 0;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            reversed[k] = nums[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(reversed));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length -i -1] = temp;
        }
        System.out.println(Arrays.toString(nums));

        // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        // Comparator.reverseOrder를 쓰려면 Integer로 선언되어야 한다

        /*
        * int와 Integer는 같지 않다
        * 같은 정수 타입을 사용하긴 하나 int는 primitive type 즉 원시적인 자료형
        * Integer는 클래스로 이루어져있으며 Wrapper Class
        * 같은 정수지만 int는 연산만 가능한 반면 Integer는 다양한 기능을 사용할 수 있다
        * double - Double
        * float - Float
        * long - Long
        */

        // 평균 구하기
        int sum = 0; // 총합을 저장하기 위한 변수
        float average = 0F;
        int[] score = {100, 88, 100, 100, 90};
        // 총합 : **
        // 평균 : **

        for (int scores : score) {
            sum += scores;
        }
        average = (float)sum / score.length; // ?
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

        // 최대 최솟값 구하기
        int[] score2 = {79, 88, 91, 33, 100, 55, 95};

//        Arrays.sort(score2);
//        System.out.println("최소값 : " + score2[0]);
//        System.out.println("최대값 : " + score2[6]);
        // 비교?
        int min = score2[0];
        int max = score2[0];
        // min 과 max 선언 이유 min과 max를 초기화 하기 위해 선언

        for (int i = 1; i < score2.length; i++) {
            if (score2[i] < min) min = score2[i];
            if (score2[i] > max) max = score2[i];
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);

        // 요일 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        // 1에서 7까지 숫자를 입력 받아서 요일을 출력하도록
        // 범위를 벗어나면 잘못입력하셨습니다 출력
        Scanner scanner = new Scanner(System.in);

//        System.out.print("번호를 입력하세요 : ");
//        int weekNum = scanner.nextInt();
//
//
//        if (weekNum < 1 || weekNum > 7) {
//            System.out.println("범위를 벋어나셨습니다.");
//            return;
//        }
//        System.out.println("입력하신 요일은 " + week[weekNum - 1] + "요일입니다.");

        // 값 target이 처음 나타나는 인덱스를 찾고, 없으면 -1을 출력하기
        // 찾을 target은 1~10까지 입력받기
        int[] a = {4, 2, 7, 2, 3, 7, 4};
        System.out.print("target을 입력해주세요 : ");
        int target = scanner.nextInt();

        if (target < 1 || target > 10) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                index = i;
                break; // 처음 인덱스를 찾아야 함 따라서 첫 인덱스 찾은후 for문 종료 필요
            }
        }

        if (index == -1) {
            System.out.println("인덱스 : " + index);
            System.out.println("인덱스 값이 없습니다");
        } else {
            System.out.println(target + "의 값은" + " 인덱스 " + index + "에 있습니다");
        }
    }
}
