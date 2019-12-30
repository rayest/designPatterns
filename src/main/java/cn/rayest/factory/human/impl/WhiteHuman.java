package cn.rayest.factory.human.impl;

import cn.rayest.factory.human.Human;

public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色");
    }

    public void talk() {
        System.out.println("我是白种人");
    }
}
