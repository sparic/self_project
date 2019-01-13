package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class Waiting2PayState implements State {

    private Order order;

    public Waiting2PayState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("等待支付中，无法创建订单");
    }

    @Override
    public void payOrder() {
        System.out.println("支付成功");
        order.setState(order.getWaiting2SendState());
    }

    @Override
    public void sendGood() {
        System.out.println("尚未支付，商家无法发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("尚未支付，无法确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("尚未支付，无法申请退货");
    }

    @Override
    public void cancelOrder() {
        System.out.println("订单取消成功");
        order.setState(order.getClosedState());
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("尚未支付，无法审核退货");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("尚未支付，无法拒绝退货");
    }
}
