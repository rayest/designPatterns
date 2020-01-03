package cn.rayest.facade.computer.impl;

import cn.rayest.facade.computer.Computer;

public class CPU implements Computer {

    @Override
    public void start() {
        System.out.println("CPU 启动");
    }

    @Override
    public void shutdown() {
        System.out.println("CPU 关闭");
    }
}
