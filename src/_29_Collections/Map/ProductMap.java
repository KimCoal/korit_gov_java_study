package _29_Collections.Map;

/*
* 1. 스캐너 객체 하나 생성하고 변수명이 production인 hashMap선언 (키는 String, 값은 Integer)
* 2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복 상품명(키)입력받고 가격(값) 입력받고 production맵에 넣기
* 3. 전체 상품 출력하기 > 향상된 for문 순회하면서 - "아이폰17 > 1250000원" 이런식으로 출력
* 4. 상품 가격 수정 > 수정할 상품명 입력받고 입력한 상품이 productionMap에 있으면 수정할 가격입력받고
* 없으면 해당 상품이 없습니다 출력 > 만약 수정 성공시 가격이 수정되었습니다 출력
* 5. 특정 상품 검색 > 검색할 상품명 입력받고 입력한 상품이 있으면 출력 없으면 해당 상품이 없습니다 출력
* 6. 정렬하기 > 키 기준 정렬후 출력
* 7. 내림차순 정렬 > 키 기준 내림차순 정렬
* */

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {

        Map<String, Integer> productionMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("상품 등록하기");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "번째 상품을 등록해 주세요.");
            System.out.print(">>> ");
            String key = scanner.nextLine();
            System.out.println("상품의 가격을 입력해주세요.");
            System.out.print(">>> ");
            Integer val = Integer.parseInt(scanner.nextLine());
            productionMap.put(key, val);
        }

        System.out.println("전체 상품 출력하기");
        for (Map.Entry<String, Integer> str : productionMap.entrySet()) {
            System.out.println(str.getKey() + " > " + str.getValue() + "원");
        }

        System.out.println("상품 가격 수정하기");
        System.out.println("수정할 항목을 입력하세요.");
        System.out.print(">>> ");
        String replaceKey = scanner.nextLine();

        if (productionMap.containsKey(replaceKey)) {
            System.out.println("수정할 가격을 입력하세요.");
            System.out.print(">>> ");
            int replaceVal = Integer.parseInt(scanner.nextLine());
            productionMap.replace(replaceKey, replaceVal);
            System.out.println("가격이 수정되었습니다.");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        System.out.println("상품 검색하기");
        System.out.println("검색할 항목을 입력해주세요.");
        String searchProduction = scanner.nextLine();

        if (productionMap.containsKey(searchProduction)) {
            System.out.println(productionMap.get(searchProduction));
        } else {
            System.out.println("해당 항목이 존재하지 않습니다.");
        }

        Set<Map.Entry<String, Integer>> setProductionMap = new HashSet<>(productionMap.entrySet());
        List<Map.Entry<String, Integer>> listProductionMap = new ArrayList<>(setProductionMap);

        System.out.println("오름차순 정렬하기");
        Collections.sort(listProductionMap, Map.Entry.comparingByKey());
        System.out.println(listProductionMap);

        System.out.println("내림차순 정렬하기");
        Collections.sort(listProductionMap, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println(listProductionMap);





    }
}
