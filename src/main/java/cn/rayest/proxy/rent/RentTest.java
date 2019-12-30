package cn.rayest.proxy.rent;

import cn.rayest.proxy.rent.impl.Rent;

import java.lang.reflect.Proxy;

public class RentTest {
    public static void main(String[] args) {
        Tenant tenant = new Tenant("lee");
        TenantInvocationHandler invocationHandler = new TenantInvocationHandler(tenant);
        ClassLoader classLoader = tenant.getClass().getClassLoader();
        Rent proxyInstance = (Rent) Proxy.newProxyInstance(classLoader, new Class[]{Rent.class}, invocationHandler);
        proxyInstance.rentOneRoom();
    }
}
