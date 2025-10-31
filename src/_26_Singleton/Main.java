package _26_Singleton;

public class Main {
    public static void main(String[] args) {

        LogManager logManager = LogManager.getInstance();
        LogManager logManager1 = LogManager.getInstance();
        logManager.log("첫번째 로그 메세지");
        logManager1.log("두번째 로그 메세지");
        System.out.println(logManager == logManager1);

    }
}
