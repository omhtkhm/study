package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class WithdrawAccountATM implements Runnable{
    Account account;

    public WithdrawAccountATM(Account pAccount){
        account = pAccount;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdrawMoney(100l);
        }
    }
}
