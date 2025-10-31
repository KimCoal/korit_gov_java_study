package _26_Singleton.Ex1;

public class Main {
    public static void main(String[] args) {
        Ex1 ex1 = Ex1.getExample();
        Ex1 ex2 = Ex1.getExample();

        System.out.println(ex1 == ex2);


    }
}
