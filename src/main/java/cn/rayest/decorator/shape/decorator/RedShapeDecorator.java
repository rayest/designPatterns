package cn.rayest.decorator.shape.decorator;

import cn.rayest.decorator.shape.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        this.decoratedShape.draw();
        this.setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("为图形描边为红色");
    }
}
