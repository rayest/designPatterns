package cn.rayest.flyweight;

import java.util.HashMap;

public class SignInfoFactory {
    private static HashMap<String, SignInfo> hashMap = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result;
        if (!hashMap.containsKey(key)) {
            System.out.println("创建对象并放到缓存池中");
            result = new SignInfo4(key);
            hashMap.put(key, result);
            return result;
        }
        System.out.println("直接从缓存中获取");
        return hashMap.get(key);
    }
}
