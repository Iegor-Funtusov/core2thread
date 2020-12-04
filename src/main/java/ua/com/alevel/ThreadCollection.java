package ua.com.alevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Iehor Funtusov, created 01/12/2020 - 8:50 PM
 */

public class ThreadCollection {

    private final List<Integer> integers;
    private final int size;

    public ThreadCollection(int size) {
        int[] random = IntStream.generate(() -> new Random().nextInt(size)).limit(size).toArray();
        this.integers = Arrays.stream(random).boxed().collect(Collectors.toList());
        this.size = size;
    }

    public void sum() throws InterruptedException {
        System.out.println("integers = " + integers);
        for (int i = 0; i < 3; i++) {
            SumThread sumThread = new SumThread(integers, i);
            sumThread.start();
            boolean flag = true;
            int sum = 0;
            do {
                sum = sumThread.getSum();
            }
            while (flag);
            System.out.println("sum = " + sum);
        }



//        long start = System.nanoTime();
//        integers.stream().mapToInt(Integer::intValue).sum();
//        long end = System.nanoTime() -start;
//        System.out.println("end = " + end);
//
//        start = System.nanoTime();
//        integers.stream().parallel().mapToInt(Integer::intValue).sum();
//        end = System.nanoTime() -start;
//        System.out.println("end = " + end);
//
//        start = System.nanoTime();
//        integers.parallelStream().mapToInt(Integer::intValue).sum();
//        end = System.nanoTime() -start;
//        System.out.println("end = " + end);
    }
}
