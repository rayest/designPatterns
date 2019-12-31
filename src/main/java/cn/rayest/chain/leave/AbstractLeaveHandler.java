package cn.rayest.chain.leave;

public abstract class AbstractLeaveHandler {
    protected int MIN = 1;
    protected int MIDDLE = 3;
    protected int MAX = 30;

    protected String handlerName;

    protected AbstractLeaveHandler nextLeaveHandler;

    protected void setNextLeaveHandler(AbstractLeaveHandler handler) {
        this.nextLeaveHandler = handler;
    }

    public void handleRequest(LeaveRequest request) {

    }
}

