package cn.rayest.proxy.game.impl;

import cn.rayest.proxy.game.GamePlayer;

public class GamePlayerProxy implements GamePlayer {
    private GamePlayerImpl gamePlayer;

    public GamePlayerProxy(GamePlayerImpl gamePlayer) {
        this.gamePlayer = gamePlayer;
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
