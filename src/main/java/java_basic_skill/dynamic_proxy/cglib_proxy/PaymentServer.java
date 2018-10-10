package java_basic_skill.dynamic_proxy.cglib_proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标类，（委托类）
 * @author shangxiaofei
 *
 */
public class PaymentServer {

    public Map<String, String> payMoney(String name,Integer money){
        System.out.println("paymentServer.payMoney()付钱=========>名字【"+name+"】,money=【"+money+"】");
        Map<String, String> map=new HashMap<String, String>();
        map.put("result", "已经完成付钱");
        return map;
    }
}