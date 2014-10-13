package com.xiaohao.pattern.abstractFactory;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Computer {

    CPU cpu;

    public Computer(CUPFactory factory){
        cpu =factory.productCpu();
        cpu.process();
    }

}
