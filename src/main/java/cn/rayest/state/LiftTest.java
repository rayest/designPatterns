package cn.rayest.state;

import cn.rayest.state.impl.OpeningState;

public class LiftTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpeningState());
        context.open();
        context.close();
    }
}
