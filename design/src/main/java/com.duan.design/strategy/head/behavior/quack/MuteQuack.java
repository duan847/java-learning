package com.duan.design.strategy.head.behavior.quack;

/**
 * 不会叫
 * @author duanjw
 */
public class MuteQuack implements QuakcBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
