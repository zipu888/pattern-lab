package com.xiaohao.pattern.builder;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Customer {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        StarbucksBuilder builder = new CoffeeBuilder();

        waiter.setStarbucksBuilder(builder);

        //Alternatively you can use tea builder to build a tea
        //StarbucksBuilder teaBuilder = new TeaBuilder();
        waiter.constructStarbucks();

        //get the drink built
        Starbucks starbucks =waiter.getstarbucksDrink();



    }

}
