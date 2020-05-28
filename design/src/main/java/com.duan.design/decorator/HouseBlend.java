package com.duan.design.decorator;

/**
 * 混合咖啡
 * @author duanjw
 */
public class HouseBlend extends Beverage {

    private double houseBlendCost = 8;

    public HouseBlend() {
        this.description = "HouseBlend（¥"+ houseBlendCost + "）";
    }
    @Override
    public double cost() {
        return houseBlendCost;
    }
}
