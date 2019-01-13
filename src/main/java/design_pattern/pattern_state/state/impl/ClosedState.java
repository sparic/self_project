package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class ClosedState implements State {

    private Order order;

    public ClosedState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("订单已关闭，无法被重新创建");
    }

    @Override
    public void payOrder() {
        System.out.println("订单已关闭，无法被支付");
    }

    @Override
    public void sendGood() {
        System.out.println("订单已关闭，无法发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("订单已关闭，无法确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("订单已关闭，无法申请退货");
    }

    @Override
    public void cancelOrder() {
        System.out.println("订单已关闭，无法取消订单");
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("订单已关闭，无法审核退货申请");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("订单已关闭，无法审核退货申请");
    }

    @Override
    public String toString() {
        return "已关闭";
    }
}
