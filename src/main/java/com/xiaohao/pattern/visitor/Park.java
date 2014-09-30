package com.xiaohao.pattern.visitor;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class Park implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        System.out.println("Park is accepting visitor");
        visitor.visit(this);
    }
}
