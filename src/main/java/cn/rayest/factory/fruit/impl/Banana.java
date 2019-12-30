package cn.rayest.factory.fruit.impl;

import cn.rayest.factory.fruit.Fruit;

public class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
