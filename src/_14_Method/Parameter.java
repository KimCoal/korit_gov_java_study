package _14_Method;

public class Parameter {

    public static void power (int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }
    // int number > 매개변수, 파라미터, 인수

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다");
    }

    public static void getAvg (int a, int b, int c){
        System.out.println("평균은 : " + (float)(a + b + c) / 3);
    }

    public static void getEven (int num) {
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }

    public static void main(String[] args) {

        power(2);
        powerByExp(8, 5);

        // 3개의 정수를 전달하여 평균을 출력하는 메소드를 만드시오
        getAvg(50,127,20);

        // 정수를 전달하여 짝수인지 홀수인지 판별 후 출력하는 메소드
        // 단 삼항 연산자를 사용할 것
        getEven(4);


    }
}
