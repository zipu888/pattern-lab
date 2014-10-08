package com.xiaohao.pattern.chainOfResponsibility;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class B extends Chain {

    public B(int s) {
        this.Threshold =s;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("B: " + msg);
    }
}
