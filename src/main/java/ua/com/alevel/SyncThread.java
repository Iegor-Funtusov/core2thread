package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 04/12/2020 - 7:36 PM
 */

public class SyncThread extends Thread {

    private Inc inc;

    public SyncThread(Inc inc) {
        super();
        this.inc = inc;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("name = " + name);
//        synchronized (inc) {
//            int i = inc.getI();
//            i++;
//            inc.setI(i);
//        }
        int i = inc.getI();
        i++;
        inc.setI(i);
    }

    public Inc getInc() {
        return inc;
    }
}
