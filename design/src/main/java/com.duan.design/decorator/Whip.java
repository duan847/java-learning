package com.duan.design.decorator;

/**
 * 泡沫
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    /**
     * 泡沫的价钱
     */
    private double whipCost = 1;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 重写描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Whip（¥"+ whipCost + "）";
    }

    /**
     * 重新计算价钱 = 泡沫的价钱 + 饮料的价钱
     * @return
     */
    @Override
    public double cost() {
        return whipCost + beverage.cost();
    }
}
