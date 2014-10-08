package com.xiaohao.pattern.chainOfResponsibility;

/**
 * Created by xiaohao on 2014/10/8.
 */
public abstract class Chain {

    public static int One = 1;

    public static int Two = 2;

    public static int Three = 3;

    protected int Threshold;

    protected Chain next;

    public void setNext(Chain next) {
        this.next = next;
    }

    public void message(String msg, int priority) {
        //if the priority is less than Threshold it is handled
        if (priority <= Threshold) {
            writeMessage(msg);
        }

        if (next != null) {
            next.message(msg, priority);
        }
    }

    protected abstract void writeMessage(String msg);

}
