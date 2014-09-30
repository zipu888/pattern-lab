package com.xiaohao.pattern.observer;

/**
 * Created by xiaohao on 2014/9/30.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyAllObservers();

}
