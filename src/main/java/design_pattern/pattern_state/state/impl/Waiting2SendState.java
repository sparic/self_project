package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class Waiting2SendState implements State {

    private Order order;

    public Waiting2SendState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("待发货中，无法创建订单");
    }

    @Override
    public void payOrder() {
        System.out.println("待发货中，无法支付订单");
    }

    @Override
    public void sendGood() {
        System.out.println("发货完成...");
        order.setState(order.getWaiting2ReceiveState());
    }

    @Override
    public void confirmOrder() {
        System.out.println("商家尚未发货，请勿确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("商家尚未发货，无法申请退货，可以申请取消订单");
    }

    @Override
    public void cancelOrder() {
        System.out.println("取消订单");
        order.setState(order.getClosedState());
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("商家尚未发货，无法审核退货申请");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("商家尚未发货，无法审核退货申请");
    }
}
