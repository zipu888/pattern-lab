package com.xiaohao.pattern.singleton;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class ChinaPresident {

    private static ChinaPresident c;

    private ChinaPresident(){

    }

    public static ChinaPresident getPresident(){

        if(c==null){
            c = new ChinaPresident();
        }

        return c;
    }

}
