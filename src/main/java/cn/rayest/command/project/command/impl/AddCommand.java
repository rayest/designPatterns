package cn.rayest.command.project.command.impl;

import cn.rayest.command.project.command.Command;
import cn.rayest.command.project.group.Group;

public class AddCommand extends Command {

    private Group group;

    public AddCommand(Group group) {
        this.group = group;
    }

    @Override
    public void execute() {
        this.group.add();
    }
}
