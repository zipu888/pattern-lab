package com.xiaohao.pattern.abstractFactory;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Test {

    public static void main(String[] args) {
        new Computer(new AMDCPUFactory());
    }

}
