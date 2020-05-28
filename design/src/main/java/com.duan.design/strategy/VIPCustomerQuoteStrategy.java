package com.duan.design.strategy;

import java.math.BigDecimal;

/**
 * VIP客户的报价
 * @author duanjw
 */
public class VIPCustomerQuoteStrategy implements QuoteStrategy {

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！VIP客户享有8折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.8)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
