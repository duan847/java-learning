package com.duan.design.strategy.head.behavior.quack;

/**
 * 呱呱叫
 * @author duanjw
 */
public class Quack implements QuakcBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
