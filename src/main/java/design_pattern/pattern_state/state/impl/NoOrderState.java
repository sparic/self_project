package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class NoOrderState implements State {

    private Order order;

    public NoOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("创建了一个订单");
        order.setState(order.getWaiting2PayState());
    }

    @Override
    public void payOrder() {
        System.out.println("没有订单，无法支付");
    }

    @Override
    public void sendGood() {
        System.out.println("没有订单，无法发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("没有订单，无法确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("没有订单，无法申请退货");
    }

    @Override
    public void cancelOrder() {
        System.out.println("没有订单，无法取消订单");
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("没有订单，无法审核退货");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("没有订单，无法审核退货");
    }

    @Override
    public String toString() {
        return "无订单状态";
    }
}
