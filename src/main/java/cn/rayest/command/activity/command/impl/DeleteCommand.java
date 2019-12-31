package cn.rayest.command.activity.command.impl;


import cn.rayest.command.activity.command.Command;
import cn.rayest.command.activity.param.impl.IdCmdParam;

public class DeleteCommand implements Command<IdCmdParam> {

    @Override
    public void execute(IdCmdParam cmdParam) {
        // TODO: 2019-12-31 业务处理
        System.out.println("执行删除业务");
    }
}
