package cn.rayest.state.impl;

import cn.rayest.state.Context;
import cn.rayest.state.LiftState;

public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }
}
