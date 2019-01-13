package design_pattern.pattern_state;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Administrator on 2018/12/25.
 */
public class OrderStateTest {

    public static void main(String[] args) {
//        Order order = new Order();
//        System.out.println(order.getState());
//        order.createOrder();
//        System.out.println(order.getState());
////        order.cancelOrder();
////        System.out.println(order.getState());
//        order.payOrder();
//        System.out.println(order.getState());
//        order.sendGood();
//        System.out.println(order.getState());
//        order.confirmOrder();
//        System.out.println(order.getState());
//        order.applyReturnGood();
//        System.out.println(order.getState());
//        order.approveGoodReturn();
//        System.out.println(order.getState());

        AtomicReference<Integer> init = new AtomicReference<>(1);

        if (init.compareAndSet(3, 2)) {
            System.out.println("init value is 1, init is set to " + init);
        } else {
            System.out.println("init value is not 1, then init is " + init);
        }
    }
}
