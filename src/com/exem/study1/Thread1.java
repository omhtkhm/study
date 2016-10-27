package com.exem.study1;

/**
 * Created by win on 2016-10-27.
 */
public class Thread1 implements Runnable {
    Account account;

    public Thread1(Account pAccount){
        account = pAccount;
    }

    @Override
    public void run() {
        Runnable getBalanceATM = new GetBalanceATM(account);

        while(true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread getThread = new Thread(getBalanceATM);
            getThread.start();
        }
    }


}
