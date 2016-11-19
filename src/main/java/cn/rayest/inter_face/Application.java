package cn.rayest.inter_face;

import cn.rayest.inter_face.fly.FlyWithRocket;
import cn.rayest.inter_face.duck.Duck;
import cn.rayest.inter_face.duck.MallardDuck;
import cn.rayest.inter_face.duck.ModelDuck;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Mallard cn.rayest.inter_face:");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        System.out.println("Model cn.rayest.inter_face:");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFly(new FlyWithRocket());
        model.performFly();
    }
}
