package cn.rayest.chain.leave;

import cn.rayest.chain.leave.impl.DepartmentManagerLeaveHandler;
import cn.rayest.chain.leave.impl.DirectLeaderLeaveHandler;
import cn.rayest.chain.leave.impl.GeneralManagerLeaveHandler;

public class LeaveTest {
    public static void main(String[] args) {

        // 构造请求
        LeaveRequest request = new LeaveRequest();
        request.setName("lee");
        request.setLeaveDays(1);

        // 构造处理器链
        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("直接领导");
        AbstractLeaveHandler departmentManagerLeaveHandler = new DepartmentManagerLeaveHandler("部门经理");
        AbstractLeaveHandler generalManagerLeaveHandler = new GeneralManagerLeaveHandler("总经理");

        directLeaderLeaveHandler.setNextLeaveHandler(departmentManagerLeaveHandler);
        departmentManagerLeaveHandler.setNextLeaveHandler(generalManagerLeaveHandler);

        // 处理请求
        directLeaderLeaveHandler.handleRequest(request);

    }
}
