package com.duan.design.observer.head;

/**
 * 观察者接口
 * @author duanjw
 */
public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
