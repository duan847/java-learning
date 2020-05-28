package com.duan.design.factory;

/**
 * 披萨工厂
 * @author duanjw
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new CheesePizza();
        }
        if("clam".equals(type)){
            return new ClamPizza();
        }
        return null;
    }
}
