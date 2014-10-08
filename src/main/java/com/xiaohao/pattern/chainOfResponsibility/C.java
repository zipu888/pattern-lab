package com.xiaohao.pattern.chainOfResponsibility;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class C extends Chain {

    public C(int s) {
        this.Threshold =s;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("C: " + msg);
    }
}
