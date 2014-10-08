package com.xiaohao.pattern.builder;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class CoffeeBuilder extends StarbucksBuilder {

    @Override
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}
