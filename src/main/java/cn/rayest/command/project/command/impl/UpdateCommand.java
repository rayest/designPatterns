package cn.rayest.command.project.command.impl;

import cn.rayest.command.project.command.Command;
import cn.rayest.command.project.group.Group;

public class UpdateCommand extends Command {

    private Group group;

    public UpdateCommand(Group group) {
        this.group = group;
    }

    @Override
    public void execute() {
        this.group.update();
    }
}
