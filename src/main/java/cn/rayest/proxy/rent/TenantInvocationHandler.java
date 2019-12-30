package cn.rayest.proxy.rent;

import cn.rayest.proxy.rent.impl.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TenantInvocationHandler implements InvocationHandler {

    private Rent rent; // 代理的对象

    public TenantInvocationHandler(Rent rent) {
        this.rent = rent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 对真实对象方法的调用，通过反射实现
        return method.invoke(this.rent, args);
    }
}
