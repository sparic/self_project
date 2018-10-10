package java_basic_skill.dynamic_proxy.cglib_proxy;

public class UserServiceImpl implements UserService {
    @Override  
    public String getName(int id) {  
        System.out.println("------getName------");  
        return "Tom";  
    }  
  
    @Override  
    public Integer getAge(int id) {  
        System.out.println("------getAge------");  
        return 10;  
    }  
} 