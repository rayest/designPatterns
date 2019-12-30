package cn.rayest.factory.human;

import cn.rayest.factory.human.impl.BlackHuman;
import cn.rayest.factory.human.impl.YellowHuman;

public class HumanTest {
    public static void main(String[] args) {
        // 1. 一般工厂方法
        AbstractHumanFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        // 2.简单工厂
        Human yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
