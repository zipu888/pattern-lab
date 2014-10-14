package com.xiaohao.test.threadJoin;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Add extends Thread {

    int value;

    @Override
    public void run() {
        value =1+2;
    }
}
