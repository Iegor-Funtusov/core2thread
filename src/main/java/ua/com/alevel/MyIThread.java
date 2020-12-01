package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 01/12/2020 - 8:36 PM
 */

public class MyIThread implements Runnable {

    @Override
    public void run() {
        System.out.println(" " + Thread.currentThread().getName());
    }
}
