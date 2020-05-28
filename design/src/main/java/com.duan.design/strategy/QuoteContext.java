package com.duan.design.strategy;

import java.math.BigDecimal;

/**
 * 报价上下文
 * @author duanjw
 */
public class QuoteContext {

    /**
     * 持有一个具体的报价策略
     */
    private QuoteStrategy quoteStrategy;

    /**
     * 注入报价策略
     * @param quoteStrategy
     */
    public QuoteContext(QuoteStrategy quoteStrategy){
        this.quoteStrategy = quoteStrategy;
    }

    /**
     * 回调具体报价策略的方法
     * @param originalPrice
     * @return
     */
    public BigDecimal getPrice(BigDecimal originalPrice){
        return quoteStrategy.getPrice(originalPrice);
    }
}
