package cn.rayest.interfaceDuck;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        print("Mallard cn.rayest.interfaceDuck:");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        print("\nModel cn.rayest.interfaceDuck:");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
