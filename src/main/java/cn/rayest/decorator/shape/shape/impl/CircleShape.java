package cn.rayest.decorator.shape.shape.impl;

import cn.rayest.decorator.shape.shape.Shape;

public class CircleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
