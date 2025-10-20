package _12_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 반복문(for) 순회
        for (int i = 0; i < 5; i++) {
            System.out.println(countries[i]);
        }

        // 반복문(for) 순회 with 배열 길이(.length)
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        // 향상된 for문 (for - each) / enhanced for
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
