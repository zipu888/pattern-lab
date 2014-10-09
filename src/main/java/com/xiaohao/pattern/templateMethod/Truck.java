package com.xiaohao.pattern.templateMethod;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Truck extends Vehicle {

    @Override
    void start() {
        this.status =true;
    }

    @Override
    void run() {
        System.out.println("Run slowly!");
    }

    @Override
    void stop() {
        System.out.println("Truck stop!");
    }
}
