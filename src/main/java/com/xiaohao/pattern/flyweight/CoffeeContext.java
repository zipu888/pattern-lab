package com.xiaohao.pattern.flyweight;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class CoffeeContext {

    private final int number;

    public CoffeeContext(int number) {
        this.number = number;
    }

    public int getTable(){
        return number;
    }
}
