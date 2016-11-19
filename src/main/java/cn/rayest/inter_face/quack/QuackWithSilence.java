package cn.rayest.inter_face.quack;

public class QuackWithSilence implements Quack {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
