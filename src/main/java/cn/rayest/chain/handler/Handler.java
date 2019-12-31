package cn.rayest.chain.handler;

import cn.rayest.chain.request.Woman;

public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void next(Handler handler) {
        this.nextHandler = handler;
    }

    public final void handle(Woman woman) {
        if (woman.getType() == this.level) {
            this.response(woman);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(woman);
            return;
        }
        System.out.println("无法处理");
    }

    protected abstract void response(Woman woman);
}
