package com.duan.design.state;

/**
 * 订单状态枚举
 * @author duanjw
 */
public enum EnumOrderState {
    /**
     * 待提交
     */
    WAIT_SUBMIT(0),
    /**
     * 已提交
     */
    SUBMIT(1),
    /**
     * 撤回
     */
    RECALL(2),
    /**
     * 生效中
     */
    EFFECT(3),
    /**
     * 退回
     */
    GO_BACK(4),
    /**
     * 待结束
     */
    WAIT_END(5),
    /**
     * 已结束
     */
    END(6);

    /**
     * 状态
     */
    private Integer state;

    EnumOrderState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }}
