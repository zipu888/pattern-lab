package com.xiaohao.pattern.abstractFactory;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class IntelCPUFactory implements CUPFactory {

    @Override
    public CPU productCpu() {
        return new IntelCPU();
    }
}
