package com.duan.design.strategy.head.behavior.fly;

/**
 * 翅膀飞行
 * @author duanjw
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用翅膀飞");
    }
}
