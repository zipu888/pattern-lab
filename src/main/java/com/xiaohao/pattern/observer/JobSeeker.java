package com.xiaohao.pattern.observer;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class JobSeeker implements Observer {

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }


    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified");
    }
}
