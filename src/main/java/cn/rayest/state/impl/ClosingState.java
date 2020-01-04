package cn.rayest.state.impl;

import cn.rayest.state.Context;
import cn.rayest.state.LiftState;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }
}
