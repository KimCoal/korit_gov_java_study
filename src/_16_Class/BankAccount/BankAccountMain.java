package _16_Class.BankAccount;

/*
* BankAccount 클래스에서 속성으로 balance 선언
* balance는 private로 제한
* 해당 객체를 선언할때 balance에 값주입
* 객체가 생성될때 "계좌가 개설되었습니다. 현재 잔액 : "***원" 출력
* balance의 값을 볼 수 있게 get만들기
* 메소드로 deposit, withdraw 만들기
* 이때 deposit > 입금 금액이 0원 이상일때 입금이 가능하도록
* 입금이 되었을때 "계좌에 ***원이 입금되었습니다." 현재 잔액 : "***원" 출력
* withdraw > 출금 금액이 0원 이상이면서 잔액이 출금액의 이상일 경우 출금 가능하도록
* 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
* 출금앧이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : ***" 출력
* 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
* */
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(-20000);

//        bankAccount.deposit(30000);
//        bankAccount.deposit(-30000);
//        bankAccount.withdraw(20000);
//        bankAccount.withdraw(-20000);
//        bankAccount.withdraw(40000);

        System.out.println(bankAccount.getBalance());


    }
}
