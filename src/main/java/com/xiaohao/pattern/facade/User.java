package com.xiaohao.pattern.facade;

/**
 * Created by xiaohao on 2014/9/30.
 *
 * 门面模式
 * 要求一个子系统的外部与其内部的通信必须通过一个统一的门面(Facade)对象进行。
 * 门面模式提供一个高层次的接口，使得子系统更易于使用。
 * 就如同医院的接待员一样，门面模式的门面类将客户端与子系统的内部复杂性分隔开，
 * 使得客户端只需要与门面对象打交道，
 * 而不需要与子系统内部的很多对象打交道
 */
public class User {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.startComputer();

    }

}
