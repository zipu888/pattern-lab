package com.xiaohao.pattern.observer;

/**
 * Created by xiaohao on 2014/9/30.
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
