package cn.rayest.inter_face.fly;

public class FlyWithNoWay implements Fly {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
