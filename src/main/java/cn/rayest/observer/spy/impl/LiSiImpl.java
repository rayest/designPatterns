package cn.rayest.observer.spy.impl;

import cn.rayest.observer.spy.Observer;

public class LiSiImpl implements Observer {
    public void update(String context) {
        System.out.println("李四：观察到有活动, 向秦始皇汇报:" + context);
        this.reportToEmperor();
        System.out.println("李四：汇报完毕.");
    }

    private void reportToEmperor() {
        System.out.println("报告秦始皇：韩非子活动了");
    }
}
