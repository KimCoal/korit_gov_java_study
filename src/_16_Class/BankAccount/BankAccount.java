package _16_Class.BankAccount;

import java.util.Scanner;

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
public class BankAccount {

    private int balance;

    BankAccount(int balance) {
//        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + balance + "원" );
//        this.balance = balance;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("초기 잔액을 입력하세요: ");
            int input = sc.nextInt();

            if (input >= 0) {
                this.balance = input;
                System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + this.balance + "원");
                break; // 정상 입력이므로 루프 종료
            } else {
                System.out.println("음수를 입력할 수 없습니다. 다시 입력해주세요.\n");
            }
        }
    }

    // balance값 getter
    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit) {
        if (deposit > 0) {
            balance += deposit;
        } else {
            System.out.println("0원보다 작은 돈을 입금할 수 없습니다");
        }
        System.out.println("계좌에 " + deposit + "원이 입금되었습니다. 현재 잔액 : " + balance +"원");
    }

    public void withdraw(int withdraw) {
        if (withdraw >= 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.println("계좌에서 " + withdraw + "원이 출금되었습니다. 현재 잔액 : " + balance +"원");
        } else if (withdraw > balance) {
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("출금액은 0원 이상이여야 하며, 잔액을 넘을수 없습니다.");
        }

    }

}
