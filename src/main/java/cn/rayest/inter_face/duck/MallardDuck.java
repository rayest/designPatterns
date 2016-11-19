package cn.rayest.inter_face.duck;

import cn.rayest.inter_face.fly.Fly;
import cn.rayest.inter_face.fly.FlyWithWings;
import cn.rayest.inter_face.quack.QuackWithLoud;
import cn.rayest.inter_face.quack.Quack;

public class MallardDuck extends Duck {
    private Quack quack;
    private Fly fly;

    public MallardDuck() {
        quack = new QuackWithLoud();
        fly = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard cn.rayest.inter_face!");
    }
}
