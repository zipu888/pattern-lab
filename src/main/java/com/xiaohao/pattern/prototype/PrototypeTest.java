package com.xiaohao.pattern.prototype;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        A a = new A(3);
        for (int i = 2; i < 20; i++) {

            Prototype temp =a.clone();
            System.out.print("before set Size: ");
            temp.printSize();
            temp.setSize(i);
            temp.printSize();
        }
    }

}
