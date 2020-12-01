package ua.com.alevel;

import java.util.List;

/**
 * @author Iehor Funtusov, created 01/12/2020 - 9:17 PM
 */
public class SumThread extends Thread {

    private final List<Integer> integers;
    private final int startIndex;
    private int sum;

    public SumThread(List<Integer> integers, int startIndex) {
        this.integers = integers;
        this.startIndex = startIndex;
    }

    @Override
    public void run() {
        System.out.println("name = " + Thread.currentThread().getName());
        System.out.println("startIndex = " + startIndex);
        for (int i = startIndex; i < integers.size(); i += 3) {
            int pos = i + startIndex;
            if (pos < integers.size()) {
                sum += integers.get(i);
            }
        }
        System.out.println("sum " + Thread.currentThread().getName() + ": " + sum);
    }

    public int getSum() {
        return sum;
    }
}
