package cn.rayest.chain.leave.impl;

import cn.rayest.chain.leave.AbstractLeaveHandler;
import cn.rayest.chain.leave.LeaveRequest;

public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {
    public DirectLeaderLeaveHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= this.MIN){
            System.out.println("直接主管审批");
            return;
        }
        if (null != this.nextLeaveHandler){
            this.nextLeaveHandler.handleRequest(request);
            return;
        }
        System.out.println("无法处理请假请求");
    }
}
