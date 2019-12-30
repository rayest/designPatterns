package cn.rayest.factory;

import cn.rayest.factory.fruit.Apple;
import cn.rayest.factory.fruit.Banana;
import cn.rayest.factory.fruit.Fruit;

public class Factory {
    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("banana".equals(className)) {
            return new Banana();
        } else return null;
    }
}
