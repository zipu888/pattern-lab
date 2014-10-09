package com.xiaohao.pattern.mediator;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class ColleagueA extends Colleague {

    public ColleagueA(IMediator iMediator1) {
        this.iMediator =iMediator1;
        this.iMediator.registeA(this);
    }

    @Override
    public void doSomeThing() {
        this.iMediator.fight();
    }
}
