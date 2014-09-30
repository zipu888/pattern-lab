package com.xiaohao.pattern.visitor;

/**
 * Created by xiaohao on 2014/9/30.
 */
public interface IVisitor {

    public void visit(City city);

    public void visit(Museum museum);

    public void visit(Park park);

}
