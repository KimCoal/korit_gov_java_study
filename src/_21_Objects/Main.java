package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("이동윤", "IT코리아");
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher("이동윤", "IT코리아");
        System.out.println(teacher1.equals(teacher2));
        // 객체끼리의 equals는 참조속성 비교가 기본
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        // equals와 hashcode는 서로 연결되어있는 관계이다
        // equals가 같으면 hashcode도 같아야하며 그 반대도 마찬가지이다

    }

}
