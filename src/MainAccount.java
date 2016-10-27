import com.exem.study1.*;

/**
 * Created by win on 2016-10-27.
 */
public class MainAccount {
    public static void main(String[] args) {
        Account account = new Account();

        Runnable getBalanceATM = new GetBalanceATM(account);
        Thread getThread = new Thread(getBalanceATM);
        getThread.start();

        Runnable withdrawAccountATM = new WithdrawAccountATM(account);
        Thread withdrawThread = new Thread(withdrawAccountATM);
        withdrawThread.start();

        Runnable depositAccountATM = new DepositAccountATM(account);
        Thread depositThread = new Thread(depositAccountATM);
        depositThread.start();
    }
}
