package com.xiaohao.pattern.composite;

/**
 * Created by xiaohao on 2014/10/13.
 * <p>组合模式</p>
 * 组合模式主要是应对这样的问题：一类具有“容器特征”的对象 —— 即他们在充当对象的同时，
 * 又是其他对象的容器的情况。
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。
 * 组合模式使得客户对单个对象和组合对象的使用具有一致性
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
