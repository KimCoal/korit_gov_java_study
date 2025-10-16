package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        // 대입 연산자
        int num1 = 10;

        /*
        * 여기서 = 은 대입 연산자, 해당 변수에 데이터값을 대입한다는 의미
        * 수학적 의미인 같다라는 의미가 X
        * */

        // 산술 연산자
        int num2 = 5;
        System.out.println(num1 + num2); // 15
        System.out.println(num1 - num2); // 5
        System.out.println(num1 * num2); // 50
        System.out.println(num1 / num2); // 2 나머지를 무시하고 몫만 출력
        System.out.println(num1 % num2); // 0 몫을 제외한 나머지를 출력

        System.out.println(2 + 3 * 4); // 14
        System.out.println((2 + 3) * 4); // 20

        // 복합 대입 연산자
        num1 += 10;
        // num1 = num1 + 10;
        num1 -= 5;
        // num1 = num1 - 5;
        num1 *= 2;
        // num1 = num1 * 2;
        num1 /= 3;
        // num1 = num1 / 3; 결과값(몫)을 다시 대입
        num1 %= 4;
        // num1 = num1 % 4; 결과값(나머지)을 다시 대입

        System.out.println("===============================");

        // 증감 연산자
        int j = 10;
        System.out.println(j);
        System.out.println(j++); // 40번째 라인이 실행이 되고 난 후 1증가 (후위연산자)
        System.out.println(j);
        System.out.println(++j); // 바로 1증가 = 12 (전위연산자)

        System.out.println(j--); // 출력값은 12 그러나 변수값은 11
        System.out.println(j); // 11
        System.out.println(--j); // 10
        System.out.println("===============================");

        // 비교 연산자 > 결과값이 항상 boolean
        // == 같다
        System.out.println(num1 == num2); // false
        // != 같지 않다
        System.out.println(num1 != num2); // true
        // > 왼쪽이 더 크다
        System.out.println(num1 > num2); // false
        // >= 왼쪽이 더 크거나 같다
        System.out.println(num1 >= num2); // false
        // < 왼쪽이 더 작다
        System.out.println(num1 < num2); // true
        // <= 왼쪽이 더 작거나 같다
        System.out.println(num1 <= num2); // true
        // 경고를 계속 띄워주는 결과가 정해져있고 이미 예상되기 때문이다.
        System.out.println("===============================");

        // 논리 연산자 (&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println(flag1 & flag2); // & and 논리곱 > 하나라도 false가 있으면 결과값이 false
        System.out.println(flag1 & flag1); // true
        System.out.println(flag1 | flag2); // | or 논리합 > 하나라도 true가 있으면 결과값이 true
        System.out.println(flag2 | flag2); // false
        System.out.println(!flag1); // ! not 부정 > 해당 조건의 반대를 결과값으로 출력
        System.out.println("===============================");

        // 논리 연산자 조합 (&&, ||)
        // && 선 조건이 true 일때만 후조건을 실행하며 선조건이 false이면 후조건을 실행하지 않는다












    }
}
