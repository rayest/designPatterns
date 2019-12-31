package cn.rayest.prototype;

public class MainTest {
    public static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Mail mail = new Mail(new AdvContent());
        int i = 0;
        while (i < MAX_COUNT) {
            Mail clonedMail = mail.clone();
            clonedMail.setReceiver(i + "@" + i * i + ".com");
            send(clonedMail);
            i++;
        }
    }

    private static void send(Mail mail) {
        System.out.println("发送邮件成功：" + mail.getReceiver() + ":" + mail.getSubject());
    }
}
