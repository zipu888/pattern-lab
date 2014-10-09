package com.xiaohao.pattern.templateMethod;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Car extends Vehicle {

    @Override
    void start() {
        this.status =true;
    }

    @Override
    void run() {
        System.out.println("Run fast!");
    }

    @Override
    void stop() {
        System.out.println("Car stop!");
    }
}
