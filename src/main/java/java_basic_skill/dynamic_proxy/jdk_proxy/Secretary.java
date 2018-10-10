package java_basic_skill.dynamic_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
 
public class Secretary implements InvocationHandler {
 
    private Object object;
    
    public Secretary(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
 
        System.out.println("I'm secretary,serve you,boss");
        Object result = method.invoke(object, args);
        System.out.println("are u satisfied?");
 
        return result;
    }
 
}