package cn.rayest.strategy.impl;

import cn.rayest.strategy.Strategy;

public class BackEnemyStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("阻截敌人");
    }
}
