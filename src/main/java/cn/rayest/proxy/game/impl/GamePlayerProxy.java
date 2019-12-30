package cn.rayest.proxy.game.impl;

import cn.rayest.proxy.game.GamePlayer;

public class GamePlayerProxy implements GamePlayer {
    private GamePlayer gamePlayer;

    // 代理在知道代理对象后，初始化代理对象
    public GamePlayerProxy(String username) {
        gamePlayer = new GamePlayerImpl(this, username);
    }

    @Override
    public void login() {
        this.gamePlayer.login();
    }

    @Override
    public void kill() {
        this.gamePlayer.kill();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
