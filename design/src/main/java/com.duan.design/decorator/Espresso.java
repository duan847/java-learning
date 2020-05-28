package com.duan.design.decorator;

/**
 * 浓缩咖啡
 * @author duanjw
 */
public class Espresso extends Beverage {

    private double espressoCost = 4.99;

    public Espresso() {
        this.description = "Espresso（¥"+ espressoCost + "）";
    }

    @Override
    public double cost() {
        return espressoCost;
    }
}
