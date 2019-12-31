package cn.rayest.chain;

import cn.rayest.chain.handler.Handler;
import cn.rayest.chain.handler.impl.*;
import cn.rayest.chain.request.Woman;
import cn.rayest.chain.request.impl.WomanImpl;

public class ChainTest {
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
