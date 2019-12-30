package cn.rayest.factory.human;

import cn.rayest.factory.human.impl.BlackHuman;

public class HumanTest {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
