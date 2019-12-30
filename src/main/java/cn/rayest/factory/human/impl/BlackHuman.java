package cn.rayest.factory.human.impl;

import cn.rayest.factory.human.Human;

public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色");
    }

    public void talk() {
        System.out.println("我是黑种人");
    }
}
