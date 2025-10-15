package _02_DataTypes;

/*
* 표기법
*
* 카멜 표기법 (단봉낙타 표기법) - 변수명, 메소드명
* firstName
*
* 파스칼 표기법 (쌍봉낙타 표기법) - 클래스명, 파일명
* FirstName
*
* */

public class DataTypes {
    public static void main(String[] args) {
        // 정수
        // int - 4byte (-2147483648 ~ 2147483647)
        // long - 8byte (int의 표기범위보다 큰거나 작은 수)

        // 문자형
        // char - 2byte

        // 실수형
        // float - 4byte
        // double - 8byte

        // 논리형
        // boolean - 1byte (true, false)

        System.out.println("안녕하세요"); // 문자열 > 쌍따옴표로 감싸야한다
        System.out.println(123);
        System.out.println("123"); // 문자열 취급
        System.out.println(3.14);

        /*
        * 변수 - 값을 담는 바구니
        * 데이터는 바뀔수도 있고 하나하나 수정하기엔 비효율적
        * 재사용성 향상, 유지보수 향상
        *
        * 자료형 변수명 = 데이터;
        * 자료형은 데이터의 형태
        * */

        // 정수 - int, long
        int num1 = 10; // 10이라는 값을 가진 int 자료형의 변수
        System.out.println(num1);
        int age = 27;
        System.out.println(age);

        long num2 = 124231235212312334L;
        // 선언
        // 자료형의 대문자를 끝에 붙여줘야한다 기본적으로 Integer로 인식하기 때문이다
        num2 = 9_059_496_125_780L;
        // 재할당
        // _를 삽입하여 보기 편하게 구분해줄 수 있다
        System.out.println(num2);

        // 실수 - double, float
        double d = 3.1415926234;
        System.out.println(d);

        float f = 3.1415926234F;
        System.out.println(f);
        // 출력값 - 3.1415927

        // 문자, 문자열 - char, String
        char lastName = '이';
        System.out.println("lastName = " + lastName);

        String firstName = "진규";
        System.out.println("firstName = " + firstName);

        char char1 = '가';
        char char2 = '나';
        char char3 = '다';
        System.out.println(char1 + char2 + char3);
        System.out.println("" + char1 + char2 + char3);

        String hello = "안녕하세요";
        String name = "이진규";

        System.out.println(hello + name);

        // 논리형 - boolean
        boolean isEmpty = true;
        System.out.println(isEmpty);

        // 이름 변수와 나이 변수, 주소 변수를 선언
        /*
        * 제 이름은 *** 이고, 나이는 **살이며, ***에서 살고 있습니다.
        *
        * */

        String name1 = "이진규";
        int age1 = 25;
        String add = "부산광역시 연제구";

        System.out.println("제 이름은 " + name1 + " 이고, " + "나이는 " + age1 + "살이며, " + add + "에서 살고 있습니다.");

    }
}
