package design_pattern.pattern_state.state.impl;

import design_pattern.pattern_state.Order;
import design_pattern.pattern_state.state.State;

/**
 * Created by Administrator on 2018/12/25.
 */
public class FinishState implements State {

    private Order order;

    public FinishState(Order order) {
        this.order = order;
    }

    @Override
    public void createOrder() {
        System.out.println("该订单已完成，无法被创建");
    }

    @Override
    public void payOrder() {
        System.out.println("该订单已完成，无法被支付");
    }

    @Override
    public void sendGood() {
        System.out.println("该订单已完成，无法再次发货");
    }

    @Override
    public void confirmOrder() {
        System.out.println("该订单已完成，无法再次确认收货");
    }

    @Override
    public void applyReturnGood() {
        System.out.println("顾客申请退货");
        order.setState(order.getReturningGoodState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("订单已完成，无法取消");
    }

    @Override
    public void approveGoodReturn() {
        System.out.println("订单已完成，客户未发起退货请求");
    }

    @Override
    public void rejectGoodReturn() {
        System.out.println("退货申请被拒绝");
        order.setState(order.getFinishState());
    }
}
