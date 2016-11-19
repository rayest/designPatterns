package cn.rayest.singleton.hungry;

/**
 * Created by Rayest on 2016/8/29 0029.
 * 饿汉式单例模式
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
