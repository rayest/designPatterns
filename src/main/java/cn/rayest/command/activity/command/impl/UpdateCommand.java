package cn.rayest.command.activity.command.impl;

import cn.rayest.command.activity.command.Command;
import cn.rayest.command.activity.param.impl.UpdateCommandParam;

public class UpdateCommand implements Command<UpdateCommandParam> {

    @Override
    public void execute(UpdateCommandParam cmdParam) {
        // TODO: 2019-12-31 业务处理
        System.out.println("执行更新业务");
    }
}
