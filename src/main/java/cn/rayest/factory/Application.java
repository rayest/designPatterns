package cn.rayest.factory;

import cn.rayest.factory.fruit.Fruit;

public class Application {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance(args[0]);
        if (fruit != null) {
            fruit.eat();
        }
    }
}

