package com.duan.design.decorator;

/**
 * 酱油
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    /**
     * 酱油的价钱
     */
    private double soyCost = 1;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 重写描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Soy（¥"+ soyCost + "）";
    }

    /**
     * 重新计算价钱 = 酱油的价钱 + 饮料的价钱
     * @return
     */
    @Override
    public double cost() {
        return soyCost + beverage.cost();
    }
}
