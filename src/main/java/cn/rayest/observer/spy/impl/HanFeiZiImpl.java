package cn.rayest.observer.spy.impl;

import cn.rayest.observer.spy.HanFeiZi;
import cn.rayest.observer.spy.Observable;
import cn.rayest.observer.spy.Observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZiImpl implements HanFeiZi, Observable {

    private List<Observer>observerList = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.notifyObservers("韩非子吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始玩了...");
        this.notifyObservers("韩非子在玩");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList){
            observer.update(context);
        }
    }
}
