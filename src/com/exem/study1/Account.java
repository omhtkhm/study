package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class Account {
    long balance;

    public synchronized long getBalance() {
        return balance;
    }

    public synchronized void withdrawMoney(long money) {
        long tempAmount = balance - money;

        while ( tempAmount < 0 ) {
            try {
                System.out.println("잔액없음. 대기");
                wait();
                tempAmount = balance - money;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance = tempAmount;
        System.out.println("출금완료. 현재 잔액은: " + balance);
    }

    public synchronized void depositMoney(long money) {
        balance += money;
        System.out.println(money+"원 입금완료. 잔액은: " + balance);
        notifyAll();
    }
}
