package java_basic_skill.dynamic_proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
public class Main2 {
    public static void main(String[] args) {
	        CglibProxy cglibProxy = new CglibProxy();  
	  
	        Enhancer enhancer = new Enhancer();  //主要的增强类
//	        enhancer.setSuperclass(UserServiceImpl.class);  //设置父类，被增强的类
	        enhancer.setSuperclass(Robot.class);  //设置父类，被增强的类
	        enhancer.setCallback(cglibProxy);  //回调对象
	  
//	        UserService o = (UserService)enhancer.create();//用cglibProxy来增强UserServiceImpl
//	        o.getName(1);
//	        o.getAge(1);

			Robot o = (Robot)enhancer.create();//用cglibProxy来增强UserServiceImpl
			o.running();
    }
}