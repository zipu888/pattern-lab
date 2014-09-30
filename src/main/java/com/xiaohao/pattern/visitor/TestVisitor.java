package com.xiaohao.pattern.visitor;

/**
 * Created by xiaohao on 2014/9/30.
 */
public class TestVisitor {

    public static void main(String[] args) {

        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor();

        City city = new City();

        city.accept(firstTimeVisitor);
    }

}
