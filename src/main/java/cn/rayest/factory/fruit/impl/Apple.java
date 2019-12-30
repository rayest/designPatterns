package cn.rayest.factory.fruit.impl;

import cn.rayest.factory.fruit.Fruit;

public class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
