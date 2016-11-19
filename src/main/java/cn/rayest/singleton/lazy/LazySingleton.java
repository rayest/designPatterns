package cn.rayest.singleton.lazy;

/**
 * Created by Rayest on 2016/7/15 0015.
 * 懒汉式单例模式
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
