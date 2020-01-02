package cn.rayest.observer.spy;

import cn.rayest.observer.spy.impl.HanFeiZiImpl;
import cn.rayest.observer.spy.impl.LiSiImpl;

public class SpyTest {
    public static void main(String[] args) {
        Observer lisi = new LiSiImpl();
        HanFeiZiImpl hanFeiZi = new HanFeiZiImpl();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
