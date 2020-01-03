package cn.rayest.facade.computer.impl;

import cn.rayest.facade.computer.Computer;

public class Disk implements Computer {
    @Override
    public void start() {
        System.out.println("disk 启动");
    }

    @Override
    public void shutdown() {
        System.out.println("disk 关闭");
    }
}
