package com.duan.design.strategy.head.duck;

import com.duan.design.strategy.head.behavior.fly.FlyNoWay;
import com.duan.design.strategy.head.behavior.fly.FlyRocketPowered;
import com.duan.design.strategy.head.behavior.fly.FlyWithWings;
import com.duan.design.strategy.head.behavior.quack.Quack;

/**
 * 橡皮鸭
 * @author duanjw
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        //呱呱叫
        quakcBehavior = new Quack();
        //不会飞
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}
