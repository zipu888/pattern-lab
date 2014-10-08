package com.xiaohao.pattern.factory;

/**
 * Created by xiaohao on 2014/10/8.
 * Based on different parameter, getInstance() returns a different instance of Calendar.
 *
 * java.util.Calendar - getInstance()
 * java.util.Calendar - getInstance(TimeZone zone)
 * java.util.Calendar - getInstance(Locale aLocale)
 * java.util.Calendar - getInstance(TimeZone zone, Locale aLocale)
 *
 * java.text.NumberFormat - getInstance()
 * java.text.NumberFormat - getInstance(Locale inLocale)
 */
public class HumanFactory {

    public Human createHuman(String type){

        if("b".equals(type)){
            return new Boy();
        }else {
            return new Girl();
        }
    }

}
