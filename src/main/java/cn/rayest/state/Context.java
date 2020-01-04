package cn.rayest.state;

import cn.rayest.state.impl.ClosingState;
import cn.rayest.state.impl.OpeningState;

public class Context {
    public static OpeningState openingState = new OpeningState();
    public static ClosingState closingState = new ClosingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }
}
