package _29_Collections.Map;

import java.util.*;

public class StrMap {
    /*
    * Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
    * Key는 중복될 수 없고, value는 중복이 가능하다
    * */
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();

        strMap.put("kor2025001","coal");
        strMap.put("kor2025002","kim");
        strMap.put("kor2025003","kimCoal");
        strMap.put("kor2025004","Ceramic");
        strMap.put("kor2025005","Soil");


        System.out.println(strMap);

        // Map의 순회
        // Map은 직접적으로 순회할 수 없다 > 직접 for - each를 돌릴 수 없다
        // 순회하기 위해서는 Iterable이라는 인터페이스를 구현한 클래스여야 하는데
        // Map은 그렇지 않다
        // Collection은 Iterable 인터페이스를 상속받고 Map이 이것으로 구현이 되어있어야하는데
        // 그렇지 않음

        System.out.println(strMap.keySet()); // 키만 set형태로 반환
        System.out.println(strMap.entrySet()); // 키, 값 전체를 set형태로 반환

        List<String> keyList = new ArrayList<>(strMap.keySet());
        Collections.sort(keyList);
        for (String key : keyList) {
            System.out.println("키 : " + key + ", 값 : " + strMap.get(key));
        }

        for (Map.Entry<String, String> entry : strMap.entrySet()) {
            System.out.println("[Entry]" + entry.getKey() + " > " + entry.getValue());
        }

        strMap.put("kor2025005", "Rock");
        System.out.println(strMap);
        // Map의 특징 중 하나로 하나의 key에는 하나의 value만 가능
        // 만약에 key가 동일하게 들어간다면 value값은 최신 것으로 덮어쓰기 된다

        strMap.replace("kor2025002" , "Sulfur");
        System.out.println(strMap.get("kor2025002"));

        // 특정 키의 존재 여부
        boolean searchKeyFlag1 = strMap.containsKey("ko2025005");
        System.out.println(searchKeyFlag1);

        // 특정 값의 존재 여부
        boolean searchValueFlag1 = strMap.containsValue("coal");
        System.out.println(searchValueFlag1);


    }
}
