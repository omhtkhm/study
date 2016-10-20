import java.util.ArrayList;

/**
 * Created by win on 2016-10-18.
 */
public class Washroom {
    ArrayList<String> arrayUser = new ArrayList<>();
    int iVacancy = 3;

    public void useWashroom(String user) {
        synchronized (this) {
            while(iVacancy == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            iVacancy--;
        }
        arrayUser.add(user);

        System.out.println(user + " 사용중.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user + " 사용완료!");
        iVacancy++;
        synchronized (this) {
            notifyAll();
        }
    }
    //sooksook
}
