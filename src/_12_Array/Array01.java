package _12_Array;

import java.sql.Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열
        // 같은 자료형 데이터를 연속된 공간에 저장하는 고정 크기 컨테이너

        // 배열을 쓰지않으면 같은 역할의 변수가 늘어남 (비효율적)
        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        // 1) 선언 + 공간 할당
//        String[] countries = new String[5]; // 5개의 공간 할당
        // 2) 선언 형태만 바뀐 동일 문법
//        String countries[] = new String[5];

        // 값 채우기 (인덱스)
//        countries[0] = "Hungary";
//        countries[1] = "Croatia";
//        countries[2] = "Slovenia";
//        countries[3] = "Austria";
//        countries[4] = "Czech";
//        countries[5] = "Korea";
        // 할당된 공간의 크기보다 더 넣게 되면 ArrayIndexOfOutBounds예외 발생
//        System.out.println(countries[1]);

        // 3) 선언과 동시에 값 나열
//        String[] countries = new String[] {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 4) 선언과 동시에 값 나열 (new 생략)
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 배열의 값 변경
        countries[2] = "Swiss";
        System.out.println(countries[2]);

        // 배열의 길이
        System.out.println(countries.length);

//        int[] numbers = new int[3];
        int[] numbers = {1, 2, 3};
        boolean[] booleans = {true, false, true, false};
        double[] doubles = {15.12, 12.12, 15.69, 92.23};
        float[] floats = {12.3F, 53.64F, 22.55F};
        long[] longs = {100L, 123123L, 12314124L};

    }
}
