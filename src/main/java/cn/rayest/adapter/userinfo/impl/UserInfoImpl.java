package cn.rayest.adapter.userinfo.impl;

import cn.rayest.adapter.userinfo.UserInfo;

public class UserInfoImpl implements UserInfo {
    @Override
    public String getUsername() {
        System.out.println("这是员工的姓名");
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println("这是员工的地址");
        return null;
    }

    @Override
    public String getMobile() {
        System.out.println("这是员工的手机号");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这是员工的职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这是员工的家庭电话号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这是员工的办公室电话号码");
        return null;
    }
}
