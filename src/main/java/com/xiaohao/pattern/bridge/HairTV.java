package com.xiaohao.pattern.bridge;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class HairTV implements ITV {

    @Override
    public void on() {
        System.out.println("hairTv has on...");
    }

    @Override
    public void off() {
        System.out.println("hairTv has off...");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("hairTv channel has change to " + channel);
    }
}
