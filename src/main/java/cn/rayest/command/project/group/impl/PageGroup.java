package cn.rayest.command.project.group.impl;

import cn.rayest.command.project.group.Group;

public class PageGroup extends Group {
    @Override
    public void add() {
        System.out.println("设计添加操作按钮...");
    }

    @Override
    public void delete() {
        System.out.println("设计删除操作按钮...");

    }

    @Override
    public void update() {
        System.out.println("设计更新操作按钮...");

    }

    @Override
    public void select() {
        System.out.println("设计查询操作按钮...");

    }
}
