package cn.rayest.proxy.definition.impl;

import cn.rayest.proxy.definition.Subject;

public class RealSubject implements Subject {
    @Override
    public void get() {
        System.out.println("吃饭");
    }
}
