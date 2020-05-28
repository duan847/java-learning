package com.duan.design.strategy;

import java.math.BigDecimal;

/**
 * 新客户的报价
 * @author duanjw
 */
public class NewCustomerQuoteStrategy implements QuoteStrategy {

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣！");
        return originalPrice;
    }
}
