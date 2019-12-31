package cn.rayest.chain.permission.handler.impl;

import cn.rayest.chain.permission.handler.Handler;
import cn.rayest.chain.permission.request.Woman;

public class Husband extends Handler {
    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(woman.request());
        System.out.println("丈夫同意妻子请求");
    }
}
