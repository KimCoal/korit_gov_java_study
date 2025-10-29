package _23_static.Person;

public class Person {
    public static int population;
    // 객체마다 상수 COUNTRY1을 가짐
    // 객체 수준에서의 상수(객체 수준에서 변경할 수 없는 상수)
    final String COUNTRY1 = "korea";

    // 전체 클래스가 하나의 COUNTRY2를 가짐
    static final String COUNTRY2 = "US";

    public Person() {
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구 수 : " + population);
        // showPopulation메소드는 객체가 필요없이 호출이 가능함
    }
    // 만약 멤버변수에 static이 빠진다면 static 메소드에 사용할 수 없다
    // 일반적인 멤버변수들은 객체를 새로 만들때 마다 초기화되기 때문이다
}
