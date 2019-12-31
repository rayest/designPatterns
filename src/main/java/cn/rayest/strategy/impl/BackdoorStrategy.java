package cn.rayest.strategy.impl;

import cn.rayest.strategy.Strategy;

public class BackdoorStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("找人开后门");
    }
}
