package _15_Overloading;

public class OverloadingEx {

    public static int max(int a, int b) {
//        int max = a;
//        if (b > max) {
//            max = b;
//            System.out.println(max);
//        } else {
//            System.out.println(max);
//        }
//        System.out.println("최대값은 : " + (a > b ? a : b)); // void 없을때
//        return Math.max(a, b);
        return a > b ? a : b;

    }

    public static double max(double a, double b){
//        double max = a;
//        if (b > max) {
//            max = b;
//            System.out.println(max);
//        } else {
//            System.out.println(max);
//        }
//        System.out.println("최대값은 : " + (a > b ? a : b));
//        return Math.max(a, b);
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        // max()
        // int 숫자 두개 중 더 큰 값 리턴
        // double 숫자 두개 중 더 큰 값 리턴
//        max(3,5);
//        max(3.6, 2.7);
        System.out.println(max(3,5));
        System.out.println(max(2.7, 2.9));
    }
}
