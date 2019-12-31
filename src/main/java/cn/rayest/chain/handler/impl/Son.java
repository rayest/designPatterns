package cn.rayest.chain.handler.impl;

import cn.rayest.chain.handler.Handler;
import cn.rayest.chain.request.Woman;

public class Son extends Handler {
    public Son() {
        super(SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(woman.request());
        System.out.println("儿子同意母亲的请求");
    }
}
