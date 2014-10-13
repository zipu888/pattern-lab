package com.xiaohao.pattern.composite;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }



    @Override
    public void show() {
        System.out.println(name);
    }
}
