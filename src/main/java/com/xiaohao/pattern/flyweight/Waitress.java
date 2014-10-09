package com.xiaohao.pattern.flyweight;

/**
 * Created by xiaohao on 2014/10/9.
 *
 * Flyweight pattern is used for minimizing memory usage.
 * What it does is sharing as much data as possible with other similar objects.
 *
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
