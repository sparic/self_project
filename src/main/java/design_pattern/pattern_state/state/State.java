package design_pattern.pattern_state.state;

/**
 * Created by ray on 2018/12/19.
 */
public interface State {

    void createOrder();

    void payOrder();

    void sendGood();

    void confirmOrder();

    void applyReturnGood();

    void cancelOrder();

    void approveGoodReturn();

    void rejectGoodReturn();
}
