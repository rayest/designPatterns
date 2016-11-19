package cn.rayest.proxy;

public class Application {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.get();
    }
}
