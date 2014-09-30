package com.xiaohao.pattern.visitor;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class FirstTimeVisitor implements IVisitor {

    @Override
    public void visit(City city) {
        System.out.println("I'm visiting the city!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the museum!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the park!");
    }
}
