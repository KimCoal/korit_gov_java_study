package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수에서 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
//        float scoreFloat = (float) scoreInt;
//        System.out.println(scoreFloat);

        // 실수에서 정수
        float scoreFloat = 97.3F;
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.4;
        System.out.println((int) scoreDouble);

//        double sum1 = 98 + 77.3;
        // 자동 형변환
        double sum1 = (double) 98 + 77.3;
        System.out.println(sum1);

        // 수동 형변환
        int sum2 = 98 + (int) 77.3;

        float sum3 = 98 + 77.3F; // 자동

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int > long > float > double (자동 형변환)

        int convertedScoreInt = (int) scoreDouble;
        // 자동 형변환의 역순으로 갈때는 수동 형변환 필요
        // double > float > long > int (수동 형변환)

        long scoreLong = 87L;
        convertedScoreInt = (int) scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        // 숫자를 문자열로
        int num1 = 55;
        String strNum1 = String.valueOf(num1); // 첫번째 방법
        strNum1 = Integer.toString(num1); // 두번째 방법
        
        double num2 = 55.55;
        String strNum2 = String.valueOf(num2);
        strNum2 = Double.toString(num2);

        float num3 = 56.34F;
        String strNum3 = String.valueOf(num3);
        strNum3 = Float.toString(num3);

        // 문자열에서 숫자로
        int i = Integer.parseInt("34");
        System.out.println(i);
        double d = Double.parseDouble("84.43");
        System.out.println(d);
        float f = Float.parseFloat("123.1244F");
        System.out.println(f);
            
//        i = Integer.parseInt("숫자");
//        System.out.println(i);
//        int로 바꿀수 없으니 오류 발생
        
        float floatNumber = 3.141592F;
        int convertedFloatNumber = (int) floatNumber;
        System.out.println("convertedFloatNumber = " + convertedFloatNumber);

        
    }
}
