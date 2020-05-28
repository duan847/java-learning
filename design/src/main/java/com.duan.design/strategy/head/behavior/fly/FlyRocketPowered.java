package com.duan.design.strategy.head.behavior.fly;

/**
 * 用火箭飞
 * @author duanjw
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用火箭飞");
    }
}
