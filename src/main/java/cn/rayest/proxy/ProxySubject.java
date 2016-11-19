package cn.rayest.proxy;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void prepare() {
        System.out.println("买菜、洗菜、做菜");
    }

    @Override
    public void get() {
        this.prepare();
        this.subject.get();
        this.destroy();
    }

    public void destroy() {
        System.out.println("收钱、收桌");
    }
}
