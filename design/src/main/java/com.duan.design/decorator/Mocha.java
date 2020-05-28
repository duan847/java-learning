package com.duan.design.decorator;

/**
 * 摩卡
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    /**
     * 摩卡的价钱
     */
    private double mochaCost = 1;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 重写描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Mocha（¥"+ mochaCost + "）";
    }

    /**
     * 重新计算价钱 = 摩卡的价钱 + 饮料的价钱
     * @return
     */
    @Override
    public double cost() {
        return mochaCost + beverage.cost();
    }
}
