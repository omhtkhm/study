package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class DepositAccountATM implements Runnable {
    Account account;

    public DepositAccountATM(Account pAccount){
        super();
        account = pAccount;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.depositMoney(70l);
        }
    }
}
