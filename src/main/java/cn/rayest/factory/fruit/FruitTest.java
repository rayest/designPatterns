package cn.rayest.factory.fruit;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance(args[0]);
        if (fruit != null) {
            fruit.eat();
        }
    }
}

