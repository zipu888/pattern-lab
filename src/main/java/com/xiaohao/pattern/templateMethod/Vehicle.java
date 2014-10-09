package com.xiaohao.pattern.templateMethod;

/**
 * Created by xiaohao on 2014/10/8.
 */
public abstract class Vehicle {
    //set to protected so that subclass can access
    protected boolean status;

    abstract void start();
    abstract void run();
    abstract void stop();

    public void testYourVehicle(){
        start();
        if(this.status){
            run();
            stop();
        }
    }
}
