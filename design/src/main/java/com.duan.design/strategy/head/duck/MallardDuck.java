package com.duan.design.strategy.head.duck;

import com.duan.design.strategy.head.behavior.fly.FlyWithWings;
import com.duan.design.strategy.head.behavior.quack.Quack;

/**
 * 绿头鸭子
 * @author duanjw
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        //呱呱叫
        quakcBehavior = new Quack();
        //用翅膀飞
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭子");
    }
}
