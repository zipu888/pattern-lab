package com.xiaohao.pattern.chainOfResponsibility;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class A extends Chain {

    public A(int s) {
        this.Threshold =s;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("A: " + msg);
    }
}
