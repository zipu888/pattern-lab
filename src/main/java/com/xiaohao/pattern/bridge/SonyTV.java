package com.xiaohao.pattern.bridge;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class SonyTV implements ITV {

    @Override
    public void on() {
        System.out.println("snoyTv has on...");
    }

    @Override
    public void off() {
        System.out.println("snoyTv has off...");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("snoyTv has change channel to "+channel+"...");
    }
}
