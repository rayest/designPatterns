package cn.rayest.chain.leave;

public class LeaveRequest {
    private int leaveDays; // 请假天数
    private String name; // 姓名

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
