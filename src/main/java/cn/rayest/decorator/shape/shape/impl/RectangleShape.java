package cn.rayest.decorator.shape.shape.impl;

import cn.rayest.decorator.shape.shape.Shape;

public class RectangleShape implements Shape {
    public void draw() {
        System.out.println("画方形");
    }
}
