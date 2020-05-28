package com.duan.design.strategy;

import java.math.BigDecimal;

/**
 * 老客户的报价
 * @author duanjw
 */
public class OldCustomerQuoteStrategy implements QuoteStrategy {

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
