package cn.rayest.proxy.userservice;

public class UserService {
    public void login(String username) {
        System.out.println(username + " 登录");
    }

    // final 修饰的无法被 CGLIB 代理。输出结果不同
    public final void logout(String username) {
        System.out.println(username + " 登出");
    }
}
