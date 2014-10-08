package com.xiaohao.pattern.builder;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class TeaBuilder extends StarbucksBuilder {

    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}
