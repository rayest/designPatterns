package cn.rayest.proxy.userservice;

import net.sf.cglib.proxy.Enhancer;

public class UserServiceTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new UserServiceMethodInterceptor());
        UserService userService = (UserService) enhancer.create();
        userService.login("lee");
        userService.logout("lee");
    }
}
