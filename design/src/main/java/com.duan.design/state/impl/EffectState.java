package com.duan.design.state.impl;

import com.duan.design.state.EnumOrderState;
import com.duan.design.state.Order;
import com.duan.design.state.OrderState;
import com.duan.design.state.StateContext;

/**
 * 生效状态
 *
 * @author duanjw
 */
public class EffectState implements OrderState {


    private StateContext stateContext;

    public EffectState(StateContext stateContext) {
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
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.GO_BACK.getState());
        stateContext.setState(stateContext.getGoBackState());
        System.out.println("订单" + order.toString() + "，状态由：生效中->退回");
    }

    /**
     * 结束
     */
    @Override
    public void end() {
        Order order = stateContext.getOrder();
        order.setStatus(EnumOrderState.WAIT_END.getState());
        stateContext.setState(stateContext.getWaitEndState());
        System.out.println("订单" + order.toString() + "，状态由：生效中->待结束");
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
