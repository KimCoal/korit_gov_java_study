package _19_Interface.Zookeeper;

public class ZooKeeper {
//    public void feed(Tiger tiger) {
//        System.out.println("사과를 던져준다.");
//    }
//
//    public void feed(Lion lion) {
//        System.out.println("바나나를 던져준다.");
//    }
    public void feed(Predator predator) {
        System.out.println(predator.getFood() + "를 던져준다.");
    }
    // 최상위 클래스를 매개변수로 받게 해주면 자식 클래스(Lion, Tiger) 어떤것이 들어와도 작동된다
}
