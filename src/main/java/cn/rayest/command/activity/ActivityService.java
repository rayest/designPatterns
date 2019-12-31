package cn.rayest.command.activity;

import cn.rayest.command.activity.command.impl.DeleteCommand;
import cn.rayest.command.activity.command.impl.UpdateCommand;
import cn.rayest.command.activity.dispatch.CommandDispatch;
import cn.rayest.command.activity.param.impl.IdCmdParam;
import cn.rayest.command.activity.param.impl.UpdateCommandParam;

public class ActivityService {
    private CommandDispatch activityDispatch;

    public ActivityService(CommandDispatch activityDispatch) {
        this.activityDispatch = activityDispatch;
    }

    public void update(UpdateCommandParam cmdParam) {
        activityDispatch.dispatch(cmdParam, UpdateCommand.class);
    }

    public void delete(Long id) {
        IdCmdParam cmdParam = new IdCmdParam();
        cmdParam.setId(id);
        activityDispatch.dispatch(cmdParam, DeleteCommand.class);
    }
}
