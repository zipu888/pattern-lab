package com.xiaohao.pattern.visitor;

/**
 * Created by xiaohao on 2014/9/30.
 */
public interface IElement {

    public void accept(IVisitor visitor);

}
