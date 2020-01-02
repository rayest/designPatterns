package cn.rayest.adapter.userinfo.impl;

import cn.rayest.adapter.userinfo.OuterUserInfo;

import java.util.HashMap;

public class OuterUserImpl implements OuterUserInfo {
    @Override
    public HashMap<String, String> getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "员工A");
        baseInfoMap.put("mobileNumber", "员工A的手机号");
        return baseInfoMap;
    }

    @Override
    public HashMap<String, String> getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition","员工职位 BOSS...");
        officeInfo.put("officeTelNumber", "员工办公室号码...");
        return officeInfo;
    }

    @Override
    public HashMap<String, String> getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "员工家庭电话号码...");
        homeInfo.put("homeAddress", "员工家庭地址...");
        return homeInfo;
    }
}
