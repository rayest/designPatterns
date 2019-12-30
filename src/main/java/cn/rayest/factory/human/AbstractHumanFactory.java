package cn.rayest.factory.human;

public abstract class AbstractHumanFactory {
    abstract <T extends Human> T createHuman(Class<T> c);
}
