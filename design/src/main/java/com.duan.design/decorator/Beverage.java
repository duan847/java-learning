package com.duan.design.decorator;

/**
 * 饮料抽象类
 * @author duanjw
 */
public abstract class Beverage {

    /**
     * 描述
     */
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 费用
     * @return
     */
    public abstract double cost();

}
