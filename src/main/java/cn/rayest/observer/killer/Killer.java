package cn.rayest.observer.killer;

import java.util.Observable;
import java.util.Observer;

public class Killer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刺客观察到了, 于是..." + arg.toString());
    }
}
