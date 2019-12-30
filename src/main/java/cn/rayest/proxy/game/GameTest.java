package cn.rayest.proxy.game;

import cn.rayest.proxy.game.impl.GamePlayerImpl;
import cn.rayest.proxy.game.impl.GamePlayerProxy;

public class GameTest {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayerProxy(new GamePlayerImpl("lee"));
        gamePlayer.login();
        gamePlayer.kill();
        gamePlayer.upgrade();
    }
}
