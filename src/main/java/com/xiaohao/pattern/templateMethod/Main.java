package com.xiaohao.pattern.templateMethod;

/**
 * Created by xiaohao on 2014/10/8.
 */
public class Main {

    public static  void testVehicle(Vehicle v){
        v.testYourVehicle();
    }

    public static void main(String[] args) {

        Car car = new Car();

        testVehicle(car);

        Truck truck =new Truck();

        testVehicle(truck);
    }

}
