package com.duan.design.observer.head;

/**
 * 主题
 * @author duanjw
 */
public interface Subject {

    /**
     * 观察者注册
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 观察者删除
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 主题状态改变时，通知所有观察者
     */
    void notifyObservers();
}
