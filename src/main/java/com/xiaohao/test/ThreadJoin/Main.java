package com.xiaohao.test.threadJoin;

/**
 * Created by xiaohao on 2014/10/13.
 *
 * In the main thread,
 * let addition and multiplication join the main thread.
 * The join() method is used when we want the parent thread waits until the threads
 * which call join() ends.
 * In this case,
 * we want addition and multiplication complete first and then do the division.
 */
public class Main {

    public static void main(String[] args) {

        Add t1 = new Add();
        Mul t2 = new Mul();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double n = ((double)t1.value/t2.value);

        System.out.println(n);

    }

}
