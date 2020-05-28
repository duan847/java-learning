package com.duan.design.decorator;

/**
 * 调料
 * @author duanjw
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 描述
     * @return
     */
    @Override
    public abstract String getDescription();
}
