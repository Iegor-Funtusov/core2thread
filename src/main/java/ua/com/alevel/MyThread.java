package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 01/12/2020 - 7:50 PM
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            boolean interrupted = interrupted();
            if (!interrupted) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" " + Thread.currentThread().getName());
    }
}
