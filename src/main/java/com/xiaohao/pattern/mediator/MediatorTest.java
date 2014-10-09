package com.xiaohao.pattern.mediator;

/**
 * Created by xiaohao on 2014/10/9.
 *
 * Mediator design pattern is used to collaborate a set of colleagues.
 * Those colleagues do not communicate with each other directly,
 * but through the mediator.

 * In the example below,
 * Colleague A want to talk,
 * and Colleague B wants to fight.
 * When they do some action(i.e., doSomething()),
 * they invoke mediator to do that.
 *
 */
public class MediatorTest {

    public static void main(String[] args) {

        IMediator iMediator =new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(iMediator);
        ColleagueB colleagueB = new ColleagueB(iMediator);

        colleagueA.doSomeThing();
        colleagueB.doSomeThing();

    }

}
