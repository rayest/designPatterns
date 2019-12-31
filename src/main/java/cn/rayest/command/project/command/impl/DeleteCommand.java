package cn.rayest.command.project.command.impl;

import cn.rayest.command.project.command.Command;
import cn.rayest.command.project.group.Group;

public class DeleteCommand extends Command {

    private Group group;

    public DeleteCommand(Group group) {
        this.group = group;
    }

    @Override
    public void execute() {
        this.group.delete();
    }
}
