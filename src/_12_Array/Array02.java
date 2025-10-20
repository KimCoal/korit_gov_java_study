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

        // 본인이 좋아하는 음식 5가지 배열에 저장하고
        // 향상된 for문을 이용해서 출력해보기
        // "내가 좋아하는 음식 1번 ***" ~

        String[] favFoods = {"IceCream", "Fork", "Rice", "ZeroCock"};
        int i = 0;

        for (String myFav : favFoods){
            i++;
            System.out.println("내가 좋아하는 음식 " + i + "번 " + myFav);
        }
    }
}
