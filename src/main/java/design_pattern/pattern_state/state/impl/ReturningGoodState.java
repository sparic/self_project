package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class ReturningGoodState implements State {

    private Order order;

    public ReturningGoodState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("已在退货中，订单不能被创建");
    }

    @Override
    public void payOrder() {
        System.out.println("退货中，无法被支付");
    }

    @Override
    public void sendGood() {
        System.out.println("退货中，商家无法发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("退货中，无法确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("退货中，无法再次申请退货");
    }

    @Override
    public void cancelOrder() {
        System.out.println("退货中，无法取消订单");
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("退货审核通过，退货成功");
        order.setState(order.getClosedState());
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("退货申请被拒绝，退货失败");
        order.setState(order.getFinishState());
    }
}
