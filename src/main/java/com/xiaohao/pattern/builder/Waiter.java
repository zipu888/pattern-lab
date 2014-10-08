package com.xiaohao.pattern.builder;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Waiter {

    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    public Starbucks getstarbucksDrink(){
       return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks(){
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }


}
