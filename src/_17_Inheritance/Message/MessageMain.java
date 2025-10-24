package _17_Inheritance.Message;

public class MessageMain {
    public static void main(String[] args) {

        SimpleMessage simpleMessage = new SimpleMessage("acascasc");

        System.out.println(simpleMessage.makePreFix());
        System.out.println(simpleMessage.format());
        simpleMessage.print();

        FancyMessage fancyMessage = new FancyMessage("dniawfk");

        System.out.println(fancyMessage.makePreFix());
        System.out.println(fancyMessage.format());
        fancyMessage.print();

    }
}

