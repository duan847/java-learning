package com.duan.design.state;

import com.duan.design.state.impl.*;

/**
 * @author duanjw
 */
public class StateContext {

    OrderState state;
    OrderState waitSubmitState;
    OrderState submitState;
    OrderState effectState;
    OrderState waitEndState;
    OrderState endState;
    OrderState recallState;



    OrderState goBackState;

    public OrderState getState() {
        return state;
    }


    Order order;


    public StateContext(Order order) {
        this.order = order;

        this.waitSubmitState = new WaitSubmitState(this);
        this.submitState = new SubmitState(this);
        this.effectState = new EffectState(this);
        this.waitEndState = new WaitEndState(this);
        this.endState = new EndState(this);
        this.recallState = new RecallState(this);
        this.goBackState = new GoBackState(this);

        this.state = this.waitSubmitState;

    }
    public void submit(){
        state.submit();
    }
    public void recall(){
        state.recall();
    }
    public void accept(){
        state.accept();
    }
    public void goBack() { state.goBack(); }
    public void end(){
        state.end();
    }
    public void confirmEnd(){
        state.confirmEnd();
    }

    public OrderState setState(OrderState state) {
        if(state.checked()) {
            this.state = state;
            return this.state;
        } else {
            throw new IllegalStateException("该订单不能完成此操作");
        }
    }

    public Order getOrder() {
        return order;
    }


    public OrderState getWaitSubmitState() {
        return waitSubmitState;
    }

    public void setWaitSubmitState(OrderState waitSubmitState) {
        this.waitSubmitState = waitSubmitState;
    }

    public OrderState getSubmitState() {
        return submitState;
    }

    public void setSubmitState(OrderState submitState) {
        this.submitState = submitState;
    }

    public OrderState getEffectState() {
        return effectState;
    }

    public void setEffectState(OrderState effectState) {
        this.effectState = effectState;
    }

    public OrderState getWaitEndState() {
        return waitEndState;
    }

    public void setWaitEndState(OrderState waitEndState) {
        this.waitEndState = waitEndState;
    }

    public OrderState getEndState() {
        return endState;
    }

    public void setEndState(OrderState endState) {
        this.endState = endState;
    }

    public OrderState getRecallState() {
        return recallState;
    }

    public void setRecallState(OrderState recallState) {
        this.recallState = recallState;
    }

    public OrderState getGoBackState() {
        return goBackState;
    }

    public void setGoBackState(OrderState goBackState) {
        this.goBackState = goBackState;
    }
}
