package _06_String;

public class String01 {
    public static void main(String[] args) {
        System.out.println("===============================");


        String s = "My Nickname is Coal Kim";

        System.out.println(s.length()); // 문자열의 길이

        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        System.out.println(s.contains("name")); // 결과값은 boolean 형식 포함 여부를 묻는것
        System.out.println(s.contains("age")); // false
        System.out.println(s.indexOf("Coal")); // 위치정보 (Index)
        System.out.println(s.indexOf("age")); // 해당 문자열이 없으면 결과값으로 -1 배출
        System.out.println("===============================");

        s = "I like music and movie and travel";
        System.out.println(s.lastIndexOf("and")); // 여러개 중 마지막 위치
        System.out.println(s.lastIndexOf("name")); // 해당 문자열이 없으면 -1
        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작하나? (true / false)
        System.out.println(s.startsWith("My name"));
        System.out.println(s.endsWith("travel")); // 해당 문자열로 끝나나? (true / false)
        System.out.println(s.endsWith("movie"));
        System.out.println("===============================");
    }
}
