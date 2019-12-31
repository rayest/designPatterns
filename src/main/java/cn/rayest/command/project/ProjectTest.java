package cn.rayest.command.project;

import cn.rayest.command.project.command.impl.AddCommand;
import cn.rayest.command.project.command.Command;
import cn.rayest.command.project.group.impl.CodeGroup;

public class ProjectTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(); // 项目负责人角色
        Command command = new AddCommand(new CodeGroup()); // 下达命令给相应的组
        invoker.setCommand(command); // 设置命令
        invoker.action(); // 执行命令
    }
}
