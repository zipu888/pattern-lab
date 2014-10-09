package com.xiaohao.pattern.flyweight;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class Coffee implements ICoffee {

    private final String flavor;

    public Coffee(String flavor) {
        this.flavor = flavor;
        System.out.println("coffee is created "+flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void saveCoffee(CoffeeContext coffeeContext) {
        System.out.println("serving "+flavor+" to table "+coffeeContext.getTable());
    }
}
