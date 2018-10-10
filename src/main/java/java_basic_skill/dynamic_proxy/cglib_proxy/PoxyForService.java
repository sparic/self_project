package java_basic_skill.dynamic_proxy.cglib_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * 增强类
 * @author shangxiaofei
 *
 */
public class PoxyForService implements MethodInterceptor {

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2,MethodProxy arg3) throws Throwable {
          // 增强功能的代码
        System.out.println("PoxyForService.intercept(方法执行前执行========>向统计发送消息)");
        if(arg2!=null&&arg2.length>0){
            for(int i=0;i<arg2.length;i++){
                System.out.println("PoxyForService.intercept()发送的参数内容====>"+arg2[i]);
            }
        }
        
        
        //执行方法内容
        Object object=arg3.invokeSuper(arg0, arg2);
        
        
        System.out.println("PoxyForService.intercept(方法执行后执行=======>计算时间)");
        return object;
    }
    
    

}