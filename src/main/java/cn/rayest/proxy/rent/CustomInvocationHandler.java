package cn.rayest.proxy.rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 通用的动态代理调用处理器：InvocationHandler。其他代理用例也可使用：AOP 雏形
public class CustomInvocationHandler implements InvocationHandler {

    private Object object; // 代理的对象

    public CustomInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法：" + method.getName());
        // 对真实对象方法的调用，通过反射实现。AOP 原理
        return method.invoke(this.object, args);
    }
}
