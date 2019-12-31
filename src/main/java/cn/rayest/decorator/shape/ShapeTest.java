package cn.rayest.decorator.shape;

import cn.rayest.decorator.shape.decorator.RedShapeDecorator;
import cn.rayest.decorator.shape.shape.impl.CircleShape;
import cn.rayest.decorator.shape.shape.impl.RectangleShape;
import cn.rayest.decorator.shape.shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        CircleShape circleShape = new CircleShape();
        circleShape.draw();

        Shape circle = new RedShapeDecorator(circleShape);
        circle.draw();

        Shape rectangle = new RedShapeDecorator(new RectangleShape());
        rectangle.draw();
    }
}
