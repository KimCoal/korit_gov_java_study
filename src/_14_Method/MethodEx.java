package _14_Method;

public class MethodEx {

    public static int getMax (int a, int b, int c){
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static boolean isEven (int num) {
        boolean result;
        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int getAbs (int num) {
        return (num < 0) ? -num : num;
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // 최대값 구하기 ( 세 수를 전달 )
        // max(3, 7, 5) > 7
        int getMax = getMax(3, 7, 5);
        System.out.println(getMax);

        // 홀짝 판단
        // isEven(8) > true (짝수면 true, 홀수면 false)
        boolean isEven = isEven(7);
        System.out.println(isEven);

        // 절댓값 구하기
        // 삼항 연산자 이용
        int getAbs = getAbs(-3);
        System.out.println(getAbs);


        // 포함 여부 (선형탐색)
        // contains([1, 3, 5], 3) > true, 없으면 false
        int[] numbers = {1, 3, 5};
        System.out.println(contains(numbers, 7));
        System.out.println(contains(numbers, 5));


    }
}
