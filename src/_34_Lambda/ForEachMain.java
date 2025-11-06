package _34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리", "수박", "포도");

//        for (String fru : fruits) {
//            System.out.println(fru);
//        }

        fruits.forEach(fru -> System.out.println("과일 : " + fru));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(num -> System.out.println((num * 2)));


    }
}
