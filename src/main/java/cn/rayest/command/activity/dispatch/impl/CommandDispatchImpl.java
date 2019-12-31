package cn.rayest.command.activity.dispatch.impl;

import cn.rayest.command.activity.command.Command;
import cn.rayest.command.activity.dispatch.CommandDispatch;
import cn.rayest.command.activity.param.CmdParam;

// 分发并实例化命令
public class CommandDispatchImpl implements CommandDispatch {
    @Override
    public void dispatch(CmdParam cmdParam, Class<? extends Command> clazz) {

        Command cmd = null;
        try {
            cmd = clazz.newInstance();
        } catch (Exception e) {
           e.printStackTrace();
        }
        if (cmd != null) {
            cmd.execute(cmdParam);
        }
    }
}
