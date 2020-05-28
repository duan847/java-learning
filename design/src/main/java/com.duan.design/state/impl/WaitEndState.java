package com.duan.design.state.impl;

import com.duan.design.state.EnumOrderState;
import com.duan.design.state.Order;
import com.duan.design.state.OrderState;
import com.duan.design.state.StateContext;

/**
 * 待生效状态
 *
 * @author duanjw
 */
public class WaitEndState implements OrderState {


    private StateContext stateContext;

    public WaitEndState(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    /**
     * 提交
     */
    @Override
    public void submit() {
        throw new UnsupportedOperationException("订单不能提交");
    }

    /**
     * 撤回
     */
    @Override
    public void recall() {
        throw new UnsupportedOperationException("订单不能撤回");
    }

    /**
     * 受理
     */
    @Override
    public void accept() {
        throw new UnsupportedOperationException("订单不能受理");
    }

    /**
     * 退回
     */
    @Override
    public void goBack() {
        throw new UnsupportedOperationException("订单不能退回");
    }

    /**
     * 结束
     */
    @Override
    public void end() {
        throw new UnsupportedOperationException("订单不能结束");
    }

    /**
     * 确认结束
     */
    @Override
    public void confirmEnd() {
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.END.getState());
        stateContext.setState(stateContext.getEndState());
        System.out.println("订单" + order.toString() + "，状态由：待结束->结束");
    }

    @Override
    public boolean checked() {
        return true;
    }
}
