package cn.rayest.adapter;

import cn.rayest.adapter.userinfo.impl.OuterUserImpl;
import cn.rayest.adapter.userinfo.UserInfo;

import java.util.HashMap;

public class UserInfoAdapter extends OuterUserImpl implements UserInfo {

    private HashMap<String, String> baseInfo = super.getUserBaseInfo();
    private HashMap<String, String> homeInfo = super.getUserHomeInfo();
    private HashMap<String, String> officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUsername() {
        String userName = this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getAddress() {
        String homeAddress = this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobile() {
        String mobileNumber = this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
}
