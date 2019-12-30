package cn.rayest.factory.human.impl;

import cn.rayest.factory.human.Human;

public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色");
    }

    public void talk() {
        System.out.println("我是黄种人");
    }
}
