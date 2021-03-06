package cn.rayest.chain.permission.request.impl;

import cn.rayest.chain.permission.request.Woman;

public class WomanImpl implements Woman {

    private int type = 0;
    private String request = "";

    public WomanImpl(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求: " + request;
                break;
            case 2:
                this.request = "妻子的请求: " + request;
                break;
            case 3:
                this.request = "母亲的请求: " + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String request() {
        return this.request;
    }
}
