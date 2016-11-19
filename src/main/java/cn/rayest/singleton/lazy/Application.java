package cn.rayest.singleton.lazy;

public class Application {
    public static void main(String[] args) {
        LazySingleton object1 = LazySingleton.getInstance();
        LazySingleton object2 = LazySingleton.getInstance();
        System.out.println(object1 == object2);
    }
}
