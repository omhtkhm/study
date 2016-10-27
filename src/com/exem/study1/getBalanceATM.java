package com.exem.study1;

public class GetBalanceATM implements Runnable {
    Account account;

    public GetBalanceATM(Account pAccount){
        account = pAccount;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long balance = account.getBalance();
            System.out.println("현재 잔액은 : " + balance);
        }
    }
}
