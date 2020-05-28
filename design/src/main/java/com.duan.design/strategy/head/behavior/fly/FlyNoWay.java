package com.duan.design.strategy.head.behavior.fly;

/**
 * 不会飞
 * @author duanjw
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
