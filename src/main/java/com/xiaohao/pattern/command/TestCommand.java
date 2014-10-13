package com.xiaohao.pattern.command;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class TestCommand {


    public static void main(String[] args) {
        Computer computer = new Computer();
        RestartCommand restartCommand = new RestartCommand(computer);
        ShutDownCommand shutDownCommand = new ShutDownCommand(computer);

        Switch aSwitch = new Switch();

        String str ="S";

        if(str == "s"){
            aSwitch.storeAndExecute(shutDownCommand);
        }else {
            aSwitch.storeAndExecute(restartCommand);
        }
    }



}
