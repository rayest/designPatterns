package cn.rayest.observer.killer;

import cn.rayest.observer.killer.emperor.impl.Qinshihuang;

import java.util.Observer;

public class KillerTest {
    public static void main(String[] args) {
        Observer killer = new Killer();

        Qinshihuang qinshihuang = new Qinshihuang();

        qinshihuang.addObserver(killer);
        qinshihuang.haveBreakfast();
    }
}
