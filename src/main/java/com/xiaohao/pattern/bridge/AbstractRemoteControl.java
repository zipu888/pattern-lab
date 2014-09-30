package com.xiaohao.pattern.bridge;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class AbstractRemoteControl {

    private ITV tv;

    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }

    public void turnOn(){
        tv.on();
    }

    public void turnOff(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }

}
