package java_basic_skill.dynamic_proxy.cglib_proxy;

import java.util.Map;
/**
 * 测试类
 * @author shangxiaofei
 *
 */
public class TestController {

    private PaymentServer paymentServer = PoxyFactory.getPaymentServer();
    
    public void payment(){
        System.out.println("TestController.payment()开始");
        Map<String, String> map=paymentServer.payMoney("怪物雷克", 100);
        System.out.println("TestController.payment()结束===>"+map.get("result"));
    }
    
    
    /**
     * TestController.payment()开始
     * PoxyForService.intercept(方法执行前执行========>向统计发送消息)
     * PoxyForService.intercept()发送的参数内容====>怪物雷克
     * PoxyForService.intercept()发送的参数内容====>100
     * paymentServer.payMoney()付钱=========>名字【怪物雷克】,money=【100】
     * PoxyForService.intercept(方法执行后执行=======>计算时间)
     * TestController.payment()结束===>已经完成付钱
     * @param args
     */
    public static void main(String[] args) {
        TestController testController=new TestController();
        testController.payment();
    }
}