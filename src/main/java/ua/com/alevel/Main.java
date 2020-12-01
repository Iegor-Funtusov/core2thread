package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 01/12/2020 - 7:08 PM
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = Thread.currentThread();
//        System.out.println("thread = " + thread.getName());
//        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//        System.out.println("contextClassLoader = " + contextClassLoader.getName());
//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTrace) {
//            System.out.println("element = " + element.getMethodName());
//            System.out.println("element = " + element.getClassName());
//        }

//        int priority = Thread.currentThread().getPriority();
//        System.out.println("priority = " + priority);
//
//        for (int i = 0; i < 9; i++) {
//            MyThread myThread = new MyThread("MyThread " + i);
//            int priorityCurrent = i + 1;
//            myThread.setPriority(priorityCurrent);
//            myThread.start();
//            myThread.interrupt();
//            Thread thread = new Thread(new MyIThread());
//            thread.start();
//        }

        ThreadCollection threadCollection = new ThreadCollection(100);
        threadCollection.sum();
    }
}
