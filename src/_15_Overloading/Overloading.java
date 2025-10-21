package _15_Overloading;

public class Overloading {

    public static int getPower (int num) {
        return num * num;
    }

    public static double getPower (double doublenum) {
//        int result = (int) (num * num);
//        return result;
        return (int)(doublenum * doublenum);
    }

    public static void printInfo (String name) {
        System.out.println("이름은 : " + name);
    }

    public static void printInfo (String name, int age) {
        System.out.println("이름은 : " + name + " 나이는 : " + age);
    }

    public static void printInfo (String name, int age, String email) {
        System.out.println("이름은 : " + name + " 나이는 : " + age + " 이메일은 : " + email);
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러개 선언
        // 전달값(파라미터)의 타입이 달라야한다.
        // 또는 갯수가 달라야한다.
        // 대신에 반환형은 같아도 된다.

        // printInfo()
        // 문자열 이름만 전달해서 > 이름 출력
        // 문자열 이름과 정수 나이 전달 > 이름, 나이 출력
        // 문자열 이름과 정수 나이, 문자열 이메일 전달 > 이름, 나이, 이메일 출력
        printInfo("이진규");
        printInfo("이진규", 25);
        printInfo("이진규", 25, "KimCoal@github.com");

    }
}
