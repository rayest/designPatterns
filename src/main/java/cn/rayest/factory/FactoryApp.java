package cn.rayest.factory;

/**
 * Created by Rayest on 2016/8/29 0029.
 */
interface Fruit {
    void eat();
}

class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("³ÔÆ»¹û");
    }
}

class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("³ÔÏã½¶");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple();
        } else if ("banana".equals(className)) {
            return new Banana();
        } else return null;
    }
}

public class FactoryApp {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance(args[0]);
        if (fruit != null) {
            fruit.eat();
        }
    }
}

