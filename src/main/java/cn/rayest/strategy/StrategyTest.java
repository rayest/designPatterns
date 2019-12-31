package cn.rayest.strategy;

import cn.rayest.strategy.impl.BackEnemyStrategy;
import cn.rayest.strategy.impl.BackdoorStrategy;
import cn.rayest.strategy.impl.GivenGreenLightStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        // 使用策略1
        Context backdoor = new Context(new BackdoorStrategy());
        backdoor.execute();

        // 使用策略2
        Context givenGreenLight = new Context(new GivenGreenLightStrategy());
        givenGreenLight.execute();

        // 使用策略3
        Context killEnemy = new Context(new BackEnemyStrategy());
        killEnemy.execute();

    }
}
