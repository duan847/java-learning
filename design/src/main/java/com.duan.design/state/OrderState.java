package com.duan.design.state;

/**
 * 订单状态
 * @author duanjw
 */
public interface OrderState {
    /**
     * 提交订单
     */
    void submit();

    /**
     * 撤回
     */
    void recall();

    /**
     * 受理订单
     */
    void accept();

    /**
     * 退回
     */
    void goBack();

    /**
     * 结束
     */
    void end();

    /**
     * 确定结束
     */
    void confirmEnd();

    /**
     * 检查状态
     * @return
     */
    boolean checked();
}
