package com.xiaohao.pattern.memento;

/**
 * Created by xiaohao on 2014/10/9.
 */
public abstract class Memento {

    private final String time;

    protected Memento(String time) {
        this.time = time;
    }
}
