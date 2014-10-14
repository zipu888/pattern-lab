package com.xiaohao.pattern.flyweight;

/**
 * Created by xiaohao on 2014/10/9.
 *
 * Flyweight pattern is used for minimizing memory usage.
 * What it does is sharing as much data as possible with other similar objects.
 *
 * Flyweight在拳击比赛中指最轻量级，即"蝇量级"，有些作者翻译为"羽量级"。
 * 这里使用"享元模式"更能反映模式的用意。
 * 享元模式以共享的方式高效地支持大量的细粒度对象。
 * 享元对象能做到共享的关键是区分内蕴状态（Internal State）和外蕴状态（External State）。
 * 内蕴状态是存储在享元对象内部并且不会随环境改变而改变。因此内蕴状态并可以共享。
 * 外蕴状态是随环境改变而改变的、不可以共享的状态。享元对象的外蕴状态必须由客户端保存，
 * 并在享元对象被创建之后，在需要使用的时候再传入到享元对象内部。
 * 外蕴状态与内蕴状态是相互独立的。
 */
public class Waitress {

    private static Coffee[] coffees = new Coffee[20];

    private static CoffeeContext[] coffeeContexts = new CoffeeContext[20];

    private static  int orderCount =0;

    private static CoffeeFactory coffeeFactory;

    public static void takeOrder(String flavorIn,int table){
        coffees[orderCount] = coffeeFactory.getCoffeeFlavors(flavorIn);
        coffeeContexts[orderCount] = new CoffeeContext(table);
        orderCount++;
    }

    public static void main(String[] args) {

        coffeeFactory = new CoffeeFactory();

        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 2);
        takeOrder("Regular Coffee", 1);
        takeOrder("Regular Coffee", 2);
        takeOrder("Regular Coffee", 3);
        takeOrder("Regular Coffee", 4);
        takeOrder("Cappuccino", 4);
        takeOrder("Cappuccino", 5);
        takeOrder("Regular Coffee", 3);
        takeOrder("Cappuccino", 3);

        for (int i = 0; i < orderCount; ++i) {
            coffees[i].saveCoffee(coffeeContexts[i]);
        }

        System.out.println("\nTotal Coffee objects made: " +  coffeeFactory.getTotalCoffeeFlavorMade());


    }

}
