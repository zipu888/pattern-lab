package com.xiaohao.pattern.mediator;

/**
 * Created by xiaohao on 2014/10/9.
 */
public class ConcreteMediator implements IMediator {

    ColleagueA colleagueA;
    ColleagueB colleagueB;

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
    }

    @Override
    public void talk() {
        System.out.println("Mediator is talking");
    }

    @Override
    public void registeA(ColleagueA a) {
        colleagueA =a;
    }

    @Override
    public void registeB(ColleagueB b) {
        colleagueB =b;
    }
}

abstract class Colleague {

    IMediator iMediator;

    abstract public void doSomeThing();

}
