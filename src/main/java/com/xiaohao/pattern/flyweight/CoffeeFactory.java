package com.xiaohao.pattern.flyweight;

import java.util.HashMap;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class CoffeeFactory {

    private HashMap<String,Coffee> flavors =new HashMap<String, Coffee>();

    public Coffee getCoffeeFlavors(String flavorName){
        Coffee coffee =flavors.get(flavorName);

        if(coffee==null){
            coffee = new Coffee(flavorName);
            flavors.put(flavorName,coffee);
        }

        return coffee;

    }

    public int getTotalCoffeeFlavorMade(){
        return flavors.size();
    }


}
