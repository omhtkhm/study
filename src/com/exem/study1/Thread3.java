package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class Thread3 implements Runnable {
    Account account;

    public Thread3(Account pAccount){
        account = pAccount;
    }

    @Override
    public void run() {
        Runnable withdrawAccountATM = new WithdrawAccountATM(account);

        while(true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread withdrawThread = new Thread(withdrawAccountATM);
            withdrawThread.start();
        }
    }


}
