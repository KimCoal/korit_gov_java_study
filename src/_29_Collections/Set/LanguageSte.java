package _29_Collections.Set;

/*
* 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"
* 이 요소들을 리스트에 널기
* 2. 중복제거 한 후 출력하기
* 3. 오름차순 정렬된 상태 출력하기
* 4. 특정과목 변수에 Java대입하고 맨 처음 만든 리스트에서 몇개 있는지 출력(검색)
* 5. 중복 제거 한 뒤에 set를 이용해서 중복제거된 후의 언어 갯수 출력하기
*
* */

import java.util.*;

public class LanguageSte {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java"));

        strSet.addAll(strList);
        System.out.println("중복제거 후 출력");
        System.out.println(strSet);

        strList.addAll(strSet);
        Collections.sort(strList);
        System.out.println("오름차순 정렬 후 출력");
        System.out.println(strList);

        String target = "Java";
        int count = Collections.frequency(strList, target);
        System.out.println("\n" + target + "의 개수: " + count + "개");

//        String target1 = "Java";
//        int count1 = 0;
//        for (String str : strList) {
//            if (str.equals(target1)){
//                count1++;
//            }
//        }
//        System.out.println(count1);

        strSet.addAll(strList);
        System.out.println("중복제거한 후 갯수");
        System.out.println(strSet.size());






    }
}
