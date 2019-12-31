package cn.rayest.command.project.group.impl;

import cn.rayest.command.project.group.Group;

public class RequirementGroup extends Group {
    @Override
    public void add() {
        System.out.println("我需要添加操作...");
    }

    @Override
    public void delete() {
        System.out.println("我需要删除操作...");

    }

    @Override
    public void update() {
        System.out.println("我需要更新操作...");

    }

    @Override
    public void select() {
        System.out.println("我需要查询操作...");

    }
}
