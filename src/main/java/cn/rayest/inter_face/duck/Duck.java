package cn.rayest.inter_face.duck;

import cn.rayest.inter_face.fly.Fly;
import cn.rayest.inter_face.quack.Quack;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public abstract class Duck {
    private Fly fly;
    private Quack quack;
    public Duck(){
    }

    public void setFly(Fly fly){
        this.fly = fly;
    }
    public void setQuack(Quack quack){
        this.quack = quack;
    }

    public abstract void display();
    public void performQuack(){
        quack.quack();
    }
    public void performFly(){
        fly.fly();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}

