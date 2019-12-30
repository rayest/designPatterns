package cn.rayest.proxy.definition;

import cn.rayest.proxy.definition.impl.ProxySubject;
import cn.rayest.proxy.definition.impl.RealSubject;

public class Application {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.get();
    }
}
