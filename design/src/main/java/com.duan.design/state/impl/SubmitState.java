package com.duan.design.state.impl;

import com.duan.design.state.EnumOrderState;
import com.duan.design.state.Order;
import com.duan.design.state.OrderState;
import com.duan.design.state.StateContext;

/**
 * 已提交状态
 *
 * @author duanjw
 */
public class SubmitState implements OrderState {

    private StateContext stateContext;

    public SubmitState(StateContext stateContext) {
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
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.RECALL.getState());
        stateContext.setState(stateContext.getRecallState());
        System.out.println("订单" + order.toString() + "，状态由：已提交->已撤回");
    }

    /**
     * 受理
     */
    @Override
    public void accept() {
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.EFFECT.getState());
        stateContext.setState(stateContext.getEffectState());
        System.out.println("订单" + order.toString() + "，状态由：已提交->生效中");
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
