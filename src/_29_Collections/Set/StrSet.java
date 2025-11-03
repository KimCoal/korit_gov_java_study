package _29_Collections.Set;

import java.util.*;

public class StrSet {
    /*
    * List는 순서가 있고 중복을 허용하는 반면에 Set는 순서도 없고, 중복도 허용하지 않는다
    * List > Set > List 형변환이 중요
    * */
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Swift");
        strSet1.add("Swift");

        System.out.println(strSet1);

        for (String str : strSet1) {
            System.out.println(str);
        }

        strList1.addAll(strSet1);
        System.out.println(strList1);
        Collections.sort(strList1);
        strSet1.addAll(strList1);
        System.out.println(strSet1);

        // Set는 순서가 없어서 리스트를 변환한 뒤 정렬하고
        // 다시 집어넣어도 변화하지 않는다
        // Set는 오로지 중복 제거에 의미를 둔다
    }
}
