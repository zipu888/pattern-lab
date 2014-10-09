package com.xiaohao.pattern.mediator;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class ColleagueB extends Colleague {

    public ColleagueB(IMediator mediator) {
        this.iMediator =mediator;
    }

    @Override
    public void doSomeThing() {
        this.iMediator.talk();
        this.iMediator.registeB(this);
    }
}
