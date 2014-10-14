package com.xiaohao.pattern.observer;

/**
 * Created by xiaohao on 2014/9/30.
 *
 * 观察者模式
 *
 * 又叫做发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，
 * 会通知所有观察者对象，使它们能够自动更新自己。

 *  一个软件系统常常要求在某一个对象的状态发生变化的时候，某些其它的对象做出相应的改变。
 * 做到这一点的设计方案有很多，但是为了使系统能够易于复用，应该选择低耦合度的设计方案。
 * 减少对象之间的耦合有利于系统的复用，但是同时设计师需要使这些低耦合度的对象之间能够维持行动的协调一致，
 * 保证高度的协作（Collaboration）。
 * 观察者模式是满足这一要求的各种设计方案中最重要的一种。
 */
public class Main {

    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
        hh.registerObserver(new JobSeeker("Mike"));
        hh.registerObserver(new JobSeeker("Chris"));
        hh.registerObserver(new JobSeeker("Jeff"));

        //Each time, a new job is added, all registered job seekers will get noticed.
        hh.addJob("Google Job");
        hh.addJob("Yahoo Job");
    }

}
