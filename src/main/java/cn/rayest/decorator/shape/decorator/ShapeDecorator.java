package cn.rayest.decorator.shape.decorator;

import cn.rayest.decorator.shape.shape.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
