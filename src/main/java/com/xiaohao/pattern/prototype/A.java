package com.xiaohao.pattern.prototype;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class A implements Prototype,Cloneable {

    private int size;

    public A(int size) {
        this.size = size;
    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A)super.clone();
    }

    @Override
    public void setSize(int size) {
        this.size =size;
    }

    @Override
    public void printSize() {
        System.out.println("A:size :"+size);
    }
}
