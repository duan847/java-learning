package com.duan.design.strategy.head.duck;

import com.duan.design.strategy.head.behavior.fly.FlyBehavior;
import com.duan.design.strategy.head.behavior.quack.QuakcBehavior;

/**
 * 鸭子超类
 * @author duanjw
 */
public abstract class Duck {

    /**
     * 飞行行为
     */
    public FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakcBehavior(QuakcBehavior quakcBehavior) {
        this.quakcBehavior = quakcBehavior;
    }

    /**
     * 呱呱叫行为
     */
    public QuakcBehavior quakcBehavior;

    /**
     * 飞
     */
    public void performFlay(){
        flyBehavior.fly();
    }

    /**
     * 叫
     */
    public void performQuakc(){
        quakcBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("我在游泳");
    }

    /**
     * 展现，每个鸭子外观不同，展示也不同，有实现类自己实现
     */
    public abstract void display();
}
