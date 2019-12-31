package cn.rayest.command.activity.param.impl;

import cn.rayest.command.activity.param.CmdParam;

public class UpdateCommandParam implements CmdParam {
    private Long id;
    private String title;
    private String ruleDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    @Override
    public String toString() {
        return "UpdateCommandParam{" + "id=" + id + ", title='" + title + '\'' + ", ruleDesc='" + ruleDesc + '\'' + '}';
    }
}
