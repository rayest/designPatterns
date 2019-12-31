package cn.rayest.chain.leave.impl;

import cn.rayest.chain.leave.AbstractLeaveHandler;
import cn.rayest.chain.leave.LeaveRequest;

public class GeneralManagerLeaveHandler extends AbstractLeaveHandler {
    public GeneralManagerLeaveHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= this.MAX){
            System.out.println("总经理审批");
            return;
        }
        if (null != this.nextLeaveHandler){
            this.nextLeaveHandler.handleRequest(request);
            return;
        }
        System.out.println("无法处理请假请求");
    }
}
