package _26_Singleton.Ex1;

public class Ex1 {

    private static Ex1 example;

    private Ex1() {
    }

    public static Ex1 getExample() {
        if (example == null) {
            System.out.println("객체 생성");
            example = new Ex1();
        }
        return example;
    }
}
