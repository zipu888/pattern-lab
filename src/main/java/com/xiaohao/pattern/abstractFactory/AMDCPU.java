package com.xiaohao.pattern.abstractFactory;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class AMDCPU implements CPU {

    @Override
    public void process() {
        System.out.println("AMD cpu is process>>");
    }
}
