package com.xiaohao.pattern.bridge;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class Testor {

    public static void main(String[] args) {

        HairTV hairTV = new HairTV();

        LogitechRemoteControl logitechRemoteControl = new LogitechRemoteControl(hairTV);

        logitechRemoteControl.setChannelKeyboard(100);

    }

}
