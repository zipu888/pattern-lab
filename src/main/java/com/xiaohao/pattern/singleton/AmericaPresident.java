package com.xiaohao.pattern.singleton;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class AmericaPresident {

    private static final  AmericaPresident a = new AmericaPresident();

    //私有化构造方法
    private AmericaPresident() {

    }

    public static AmericaPresident getPresident(){
        return a;
    }
}
