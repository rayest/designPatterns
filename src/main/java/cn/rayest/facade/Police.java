package cn.rayest.facade;

import cn.rayest.facade.letter.Letter;

public class Police {
    public void check(Letter letter) {
        System.out.println("检查信件：" + letter);
    }
}
