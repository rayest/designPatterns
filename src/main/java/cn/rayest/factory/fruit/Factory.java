package cn.rayest.factory.fruit;

import cn.rayest.factory.fruit.impl.Apple;
import cn.rayest.factory.fruit.impl.Banana;

public class Factory {
    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("banana".equals(className)) {
            return new Banana();
        } else return null;
    }
}
