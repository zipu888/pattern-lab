package com.xiaohao.pattern.factory;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Girl implements Human {

    @Override
    public void talk() {
        System.out.println("girl is talking~~~");
    }

    @Override
    public void walk() {
        System.out.println("girl is walking~~~");
    }
}
