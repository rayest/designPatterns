package cn.rayest.proxy.userservice;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("后置通知");
        return object;
    }
}
