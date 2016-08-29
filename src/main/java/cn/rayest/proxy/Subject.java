package cn.rayest.proxy;

/**
 * Created by Rayest on 2016/8/29 0029.
 */
interface Subject {
    public void get();
}

class RealSubject implements Subject {
    @Override
    public void get() {
        System.out.println("�Է�");
    }
}

class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void prepare() {
        System.out.println("��ˡ�ϴ�ˡ�����");
    }

    @Override
    public void get() {
        this.prepare();
        this.subject.get();
        this.destroy();
    }

    public void destroy() {
        System.out.println("��Ǯ������");
    }
}

class ProxyApp{
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.get();
    }
}
