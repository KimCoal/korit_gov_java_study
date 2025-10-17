package _10_For;

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

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 2; i <= 50 ; i += 2) {
            System.out.println(i);
        }


    }
}
