package cn.rayest.command.project.group.impl;

import cn.rayest.command.project.group.Group;

public class CodeGroup extends Group {
    @Override
    public void add() {
        System.out.println("实现添加功能...");
    }

    @Override
    public void delete() {
        System.out.println("实现删除功能...");

    }

    @Override
    public void update() {
        System.out.println("实现更新功能...");

    }

    @Override
    public void select() {
        System.out.println("实现查询功能...");

    }
}
