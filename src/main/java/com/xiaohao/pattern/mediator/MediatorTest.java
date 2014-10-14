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
 * 中介者模式（Mediator Pattern），定义一个中介对象来封装系列对象之间的交互。
 * 中介者使各个对象不需要显示地相互引用，从而使其耦合性松散，而且可以独立地改变他们之间的交互。
 *
 * Define an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it lets you vary their interaction independently。
 *
 * 中介者减少了各个同事对象的耦合，使得可以独立地改变和复用各个同事对象和中介者类；
 * 由于把对想如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，
 * 这样关注的对象就从对象各自本身的行为转移到他们之间的交互上来，也就是站在一个更宏伟的角度去考虑系统。
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
