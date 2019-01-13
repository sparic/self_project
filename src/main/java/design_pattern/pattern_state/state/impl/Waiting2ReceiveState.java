package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class Waiting2ReceiveState implements State {

    private Order order;

    public Waiting2ReceiveState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("待收货中，无法创建订单");
    }

    @Override
    public void payOrder() {
        System.out.println("待收货中，无需支付");
    }

    @Override
    public void sendGood() {
        System.out.println("商家已发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("确认收货成功");
        order.setState(order.getFinishState());
    }

    @Override
    public void applyReturnGood() {
        System.out.println("");
    }

    @Override
    public void cancelOrder() {
        System.out.println("");
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("");
    }
}
