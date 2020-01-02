package cn.rayest.adapter;

import cn.rayest.adapter.userinfo.impl.UserInfoImpl;

public class AdapterTest {
    public static void main(String[] args) {
        // 查询自己公司员工信息
        UserInfoImpl userInfo = new UserInfoImpl();
        userInfo.getUsername();

        // 查询其他员工信息
        UserInfoAdapter userInfoAdapter = new UserInfoAdapter();
        userInfoAdapter.getUsername();
    }
}
