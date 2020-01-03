package cn.rayest.facade.computer.impl;

import cn.rayest.facade.computer.Computer;

public class Memory implements Computer {
    @Override
    public void start() {
        System.out.println("内存 启动");
    }

    @Override
    public void shutdown() {
        System.out.println("内存 关闭");
    }
}
