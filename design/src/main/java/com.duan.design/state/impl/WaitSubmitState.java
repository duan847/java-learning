package com.duan.design.state.impl;

import com.duan.design.state.EnumOrderState;
import com.duan.design.state.Order;
import com.duan.design.state.OrderState;
import com.duan.design.state.StateContext;

/**
 * 待提交状态
 *
 * @author duanjw
 */
public class WaitSubmitState implements OrderState {

    private StateContext stateContext;

    public WaitSubmitState(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    /**
     * 提交
     */
    @Override
    public void submit() {
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.SUBMIT.getState());
        stateContext.setState(stateContext.getSubmitState());
        System.out.println("订单" + order.toString() + "，状态由：待提交->已提交");
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
        throw new UnsupportedOperationException("订单不能确认结束");
    }

    @Override
    public boolean checked() {
        return true;
    }
}
