package cn.rayest.proxy;

public class RealSubject implements Subject {
    @Override
    public void get() {
        System.out.println("吃饭");
    }
}
