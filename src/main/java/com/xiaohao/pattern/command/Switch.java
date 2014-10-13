package com.xiaohao.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Switch {

    private List<Command> commands = new ArrayList<Command>();

    public Switch(){

    }

    public void storeAndExecute(Command command){
        commands.add(command);
        command.execute();
    }

}
