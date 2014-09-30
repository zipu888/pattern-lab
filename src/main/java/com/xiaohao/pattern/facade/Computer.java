package com.xiaohao.pattern.facade;

/**
 * Created by xiaohao on 2014/9/30.
 *
 * this class is the facede of cpu harddrive memory
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }


    public void startComputer(){
        cpu.processData();
        memory.loadData();
        hardDrive.readData();
    }

}
