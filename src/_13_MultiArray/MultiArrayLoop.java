package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 행 순회
            for (int j = 0; j < 5; j++) { // 열 순회
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < seats.length; i++) { // { } 즉, 행의 갯수
            for (int j = 0; j < seats[i].length; j++) { // { } 내부의 순환 i = 0일때 즉, 1행의 갯수만큼 반복출력
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) { // 어차피 각 행의 크기는 정해져있기때문에 크기만큼 반복한다
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        // imax 영화관
        // 세로 10칸 가로 15칸
        String[][] imaxSeats = new String[10][15];
//        String[] eng ={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < imaxSeats.length; i++) {
            String eng = String.valueOf((char) ('A' + i)); // String[] eng를 선언하지 않고 for문 내부에서 해결
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = eng + (j + 1);
//                System.out.print(imaxSeats[i][j] + " ");
            }
//            System.out.println();
        }

        imaxSeats[3][7] = "__";
        imaxSeats[5][4] = "__";
        imaxSeats[7][5] = "__";
        imaxSeats[7][6] = "__";

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) { // 어차피 각 행의 크기는 정해져있기때문에 크기만큼 반복한다
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

        // 다차원 배열 합 구하기
        // 3x3 크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기

        int[][] ary = new int[3][3];
        int num = 1;
        int sum = 0;

        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = num;
                num += 2;
                sum += ary[i][j];
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(ary));
        System.out.println("총합은 : " + sum);

        // 각 행 합, 각 열 합, 전체 합
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int n = a.length; // 2
        int m = a[0].length; // 3
        int[] rowSum = new int[n];
        int[] colSum = new int[m];
        int total = 0;
        for (int i = 0; i < n; i++) { // 0 1
            for (int j = 0; j < m; j++) { // 0 1 2
                rowSum[i] += a[i][j];
                colSum[j] += a[i][j];
                total += a[i][j];
            }
        }
        System.out.println("row : " + Arrays.toString(rowSum));
        System.out.println("col : " + Arrays.toString(colSum));
        System.out.println("총합 : " + total);

//        int sumI1 = 0;
//        int sumI2 = 0;
//        int sumJ1 = 0;
//        int sumJ2 = 0;
//        int sumJ3 = 0;
//        int sumAll = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                sumAll += a[i][j]; // 전체 합
//
//                // 행 합
//                if (i == 0) sumI1 += a[i][j];
//                if (i == 1) sumI2 += a[i][j];
//
//                // 열 합
//                if (j == 0) sumJ1 += a[i][j];
//                if (j == 1) sumJ2 += a[i][j];
//                if (j == 2) sumJ3 += a[i][j];
//            }
//        }
//        System.out.println("1행 합 : " + sumI1 + " 2행 합 : " + sumI2 + " 전체 행 합 : " + (sumI1 + sumI2));
//        System.out.println("1열 합 : " + sumJ1 + " 2열 합 : " + sumJ2 + " 3열 합 : " + sumJ3 + " 전체 열 합 : " + (sumJ1 + sumJ2 + sumJ3));
//        System.out.println("전체 합 : " + sumAll);



        // A+B, A-B, 값 구하기
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        int[][] sumA = new int[2][2];
        int[][] subB = new int[2][2];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sumA[i][j] = A[i][j] + B[i][j];
                subB[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("A + B의 값은 각각");
        for (int i = 0; i < sumA.length; i++) {
            for (int j = 0; j < sumA[i].length; j++) {
                System.out.print(sumA[i][j] +" ");
            }
        }
        System.out.println();

        System.out.println("A - B의 값은 각각");
        for (int i = 0; i < subB.length; i++) {
            for (int j = 0; j < subB[i].length; j++) {
                System.out.print(subB[i][j] + " ");
            }
        }
        System.out.println();



    }
}
