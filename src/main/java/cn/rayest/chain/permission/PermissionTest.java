package cn.rayest.chain.permission;

import cn.rayest.chain.permission.handler.Handler;
import cn.rayest.chain.permission.handler.impl.*;
import cn.rayest.chain.permission.request.Woman;
import cn.rayest.chain.permission.request.impl.WomanImpl;

public class PermissionTest {
    public static void main(String[] args) {
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.next(husband);
        husband.next(son);

        Woman woman = new WomanImpl(1, "我要出去逛街");
        father.handle(woman);
    }
}
