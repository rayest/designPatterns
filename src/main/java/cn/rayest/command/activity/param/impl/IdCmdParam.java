package cn.rayest.command.activity.param.impl;

import cn.rayest.command.activity.param.CmdParam;

public class IdCmdParam implements CmdParam {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdCmdParam{" + "id=" + id + '}';
    }
}
