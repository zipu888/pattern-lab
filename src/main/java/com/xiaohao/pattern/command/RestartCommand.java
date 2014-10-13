package com.xiaohao.pattern.command;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class RestartCommand implements Command {

    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}
