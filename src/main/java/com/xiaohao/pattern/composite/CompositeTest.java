package com.xiaohao.pattern.composite;

/**
 * Created by xiaohao on 2014/10/13.
 */
public class CompositeTest {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");
        Leaf leaf4 = new Leaf("4");
        Leaf leaf5 = new Leaf("5");

        Composite composite1 = new Composite();
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        Composite composite2 = new Composite();
        composite2.addComponent(leaf3);
        composite2.addComponent(leaf4);
        composite2.addComponent(leaf5);

        composite1.addComponent(composite2);
        composite1.show();
    }

}
