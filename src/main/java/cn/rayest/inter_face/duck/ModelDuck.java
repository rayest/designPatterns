package cn.rayest.inter_face.duck;

import cn.rayest.inter_face.fly.Fly;
import cn.rayest.inter_face.fly.FlyWithNoWay;
import cn.rayest.inter_face.quack.QuackWithLoud;
import cn.rayest.inter_face.quack.Quack;

public class ModelDuck extends Duck {
    private Fly fly;
    private Quack quack;

    public ModelDuck() {
        fly = new FlyWithNoWay();
        quack = new QuackWithLoud();
    }

    @Override
    public void display() {
        System.out.println("I am a model cn.rayest.inter_face!");
    }
}
