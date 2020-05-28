package com.duan.design.state;

/**
 * 订单状态测试
 * @author duanjw
 */
public class OrderStateTest {
    public static void main(String[] args) {

        //待提交订单
        Order order = new Order();
        order.setStatus(EnumOrderState.WAIT_SUBMIT.getState());

        StateContext stateContext = new StateContext(order);
        //提交
        stateContext.submit();
        //撤回
        stateContext.recall();
        //提交
        stateContext.submit();
        //生效
        stateContext.accept();
        //退回
        stateContext.goBack();
        //提交
        stateContext.submit();
        //生效
        stateContext.accept();
        //结束
        stateContext.end();
        //确认结束
        stateContext.confirmEnd();
        //已确认结束的再次确认结束，会报错
        stateContext.confirmEnd();
    }
}
