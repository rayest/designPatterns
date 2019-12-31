package cn.rayest.chain.permission.handler.impl;

import cn.rayest.chain.permission.handler.Handler;
import cn.rayest.chain.permission.request.Woman;

public class Father extends Handler {
    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(Woman woman) {
        System.out.println(woman.request());
        System.out.println("父亲同意女儿请求");
    }
}
