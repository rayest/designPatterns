package cn.rayest.observer.weather;

/**
 * Created by Rayest on 2016/6/1 0001.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
