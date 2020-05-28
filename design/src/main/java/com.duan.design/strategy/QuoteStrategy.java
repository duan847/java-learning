package com.duan.design.strategy;

import java.math.BigDecimal;

/**
 * 报价策略接口
 * @author duanjw
 */
public interface QuoteStrategy {
    /**
     * 获取折后价的价格
     * @param originalPrice
     * @return
     */
     BigDecimal getPrice(BigDecimal originalPrice);
}
