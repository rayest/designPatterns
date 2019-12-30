package cn.rayest.proxy.game.impl;

import cn.rayest.proxy.game.GamePlayer;

public class GamePlayerImpl implements GamePlayer {

    private String username;

    public GamePlayerImpl(String username) {
        this.username = username;
    }

    @Override
    public void login() {
        System.out.println(this.username + " 登录");
    }

    @Override
    public void kill() {
        System.out.println(this.username + " 用户消灭怪兽");
    }

    @Override
    public void upgrade() {
        System.out.println(this.username + " 用户升级");
    }
}
