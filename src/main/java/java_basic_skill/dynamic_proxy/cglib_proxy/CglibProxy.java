package java_basic_skill.dynamic_proxy.cglib_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;  
  
import java.lang.reflect.Method;  
  
  
public class CglibProxy implements MethodInterceptor {  //主要的方法拦截类，它是Callback接口的子接口，需要用户实现
    @Override  
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {  
        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");  
        System.out.println(method.getName());  
        Object o1 = methodProxy.invokeSuper(o, args);  
        System.out.println("++++++after " + methodProxy.getSuperName() + "++++++");
        return o1;  
    }  
} 