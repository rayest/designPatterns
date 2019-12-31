package cn.rayest.command.activity.dispatch;

import cn.rayest.command.activity.command.Command;
import cn.rayest.command.activity.param.CmdParam;

public interface CommandDispatch {
    void dispatch(CmdParam cmdParam, Class<? extends Command> clazz);
}
