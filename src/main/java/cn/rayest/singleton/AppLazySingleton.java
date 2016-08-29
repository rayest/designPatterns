package cn.rayest.singleton;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
// 懒汉式单例模式
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class AppLazySingleton {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        System.out.println(object1 == object2);
    }
}
