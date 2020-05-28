package com.duan.design.strategy.head;

import com.duan.design.strategy.head.behavior.fly.FlyRocketPowered;
import com.duan.design.strategy.head.duck.Duck;
import com.duan.design.strategy.head.duck.MallardDuck;
import com.duan.design.strategy.head.duck.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck= new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFlay();
        mallardDuck.performQuakc();
        mallardDuck.swim();

        System.out.println("------橡皮鸭出场------");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFlay();
        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.performFlay();
        rubberDuck.performQuakc();
        rubberDuck.swim();
    }
}
