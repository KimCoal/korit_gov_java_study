package _19_Interface.Zookeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);

    }
}
