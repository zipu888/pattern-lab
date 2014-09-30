package com.xiaohao.pattern.visitor;

import java.util.ArrayList;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class City implements IElement {

    ArrayList<IElement> places = new ArrayList<IElement>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override
    public void accept(IVisitor visitor) {

        System.out.println("City is accepting visitor");
        visitor.visit(this);

        for (IElement e : places) {
            e.accept(visitor);
        }

    }
}
