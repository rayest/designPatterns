package cn.rayest.proxy.rent;

import cn.rayest.proxy.rent.impl.Rent;

import java.lang.reflect.Proxy;

public class RentTest {
    public static void main(String[] args) {
        Tenant tenant = new Tenant("lee");
        CustomInvocationHandler invocationHandler = new CustomInvocationHandler(tenant);

        // 获取类加载器
        ClassLoader classLoader = tenant.getClass().getClassLoader();

        // 重新生成对象。
        Rent proxyInstance = (Rent) Proxy.newProxyInstance(classLoader, new Class[]{Rent.class}, invocationHandler);
        proxyInstance.rentOneRoom();
    }
}
