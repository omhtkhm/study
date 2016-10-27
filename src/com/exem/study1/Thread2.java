package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class Thread2 implements Runnable {
    Account account;

    public Thread2(Account pAccount){
        account = pAccount;
    }

    @Override
    public void run() {
        Runnable depositAccountATM = new DepositAccountATM(account);

        while(true) {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread depositThread = new Thread(depositAccountATM);
            depositThread.start();
        }
    }


}
