package com.xiaohao.test.ThreadJoin;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Mul extends Thread {

    int value;

    @Override
    public void run() {
        value =1*2;
    }
}
