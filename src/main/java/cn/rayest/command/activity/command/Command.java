package cn.rayest.command.activity.command;


import cn.rayest.command.activity.param.CmdParam;

// 命令接口
public interface Command<T extends CmdParam> {

    void execute(T cmdParam);
}
