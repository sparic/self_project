package java_basic_skill.dynamic_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk代理必须用
 */
public class Main {
 
    public static void main(String[] args) {
        Boss boss = new Boss();
 
        InvocationHandler handler = new Secretary(boss);
 
        Boss secretary = (Boss) Proxy.newProxyInstance(
                boss.getClass().getClassLoader(),
                boss.getClass().getInterfaces(),
                handler);
        
        secretary.read();
    }
}