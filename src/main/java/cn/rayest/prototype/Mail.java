package cn.rayest.prototype;

public class Mail implements Cloneable {
    private String receiver;
    private String subject;

    public Mail(AdvContent advContent) {
        this.subject = advContent.getSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }


}
