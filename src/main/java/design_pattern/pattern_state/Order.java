package design_pattern.pattern_state;

import design_pattern.pattern_state.state.State;
import design_pattern.pattern_state.state.impl.*;

/**
 * Created by Administrator on 2018/12/25.
 */
public class Order {

    private State waiting2PayState;

    private State waiting2ReceiveState;

    private State waiting2SendState;

    private State returningGoodState;

    private State finishState;

    private State closedState;

    private State noOrderState;

    private State state = noOrderState;

    public Order() {
        waiting2PayState = new Waiting2PayState(this);
        waiting2ReceiveState = new Waiting2ReceiveState(this);
        waiting2SendState = new Waiting2SendState(this);
        returningGoodState = new ReturningGoodState(this);
        finishState = new FinishState(this);
        closedState = new ClosedState(this);
        noOrderState = new NoOrderState(this);

        state = noOrderState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getWaiting2PayState() {
        System.out.println("订单状态：待付款");
        return waiting2PayState;
    }

    public State getWaiting2ReceiveState() {
        System.out.println("订单状态：待收货");
        return waiting2ReceiveState;
    }

    public State getWaiting2SendState() {
        System.out.println("订单状态：待发货");
        return waiting2SendState;
    }

    public State getReturningGoodState() {
        System.out.println("订单状态：退货中");
        return returningGoodState;
    }

    public State getFinishState() {
        System.out.println("订单状态：已完成");
        return finishState;
    }

    public State getClosedState() {
        System.out.println("订单状态：已关闭");
        return closedState;
    }

    public State getNoOrderState() {
        System.out.println("订单状态：无订单");
        return noOrderState;
    }

    public void createOrder() {
        state.createOrder();
    }

    public void payOrder() {
        state.payOrder();
    }

    public void sendGood() {
        state.sendGood();
    }

    public void confirmOrder() {
        state.confirmOrder();
    }

    public void applyReturnGood() {
        state.applyReturnGood();
    }

    public void cancelOrder() {
        state.cancelOrder();
    }

    public void approveGoodReturn() {
        state.approveGoodReturn();
    }
}
