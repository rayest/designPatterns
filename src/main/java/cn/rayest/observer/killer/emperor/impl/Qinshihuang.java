package cn.rayest.observer.killer.emperor.impl;

import cn.rayest.observer.killer.emperor.Emperor;

import java.util.Observable;

public class Qinshihuang extends Observable implements Emperor {
    @Override
    public void haveBreakfast() {
        System.out.println("秦始皇吃饭了");
        super.setChanged();
        this.notifyObservers("趁他吃饭时，杀了他");
    }

    @Override
    public void haveFun() {
        System.out.println("秦始皇玩了");
        super.setChanged();
        this.notifyObservers("趁他娱乐时，杀了他");
    }
}
