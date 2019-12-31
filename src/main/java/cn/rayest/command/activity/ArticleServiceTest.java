package cn.rayest.command.activity;

import cn.rayest.command.activity.dispatch.impl.CommandDispatchImpl;
import cn.rayest.command.activity.param.impl.UpdateCommandParam;

public class ArticleServiceTest {
    public static void main(String[] args) {

        UpdateCommandParam cmdParam = new UpdateCommandParam();
        cmdParam.setId(1L);
        cmdParam.setTitle("更新");

        ActivityService activityService = new ActivityService(new CommandDispatchImpl());
        activityService.update(cmdParam);
    }
}
