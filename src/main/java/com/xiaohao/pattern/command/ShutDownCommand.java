package com.xiaohao.pattern.command;


/**
 * Created by xiaohao on 2014/10/13.
 */
public class ShutDownCommand implements Command {

    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }



    @Override
    public void execute() {
        computer.shutDown();
    }
}
