package cn.rayest.facade;

public class LetterTest {
    public static void main(String[] args) {
        PostOfficeFacade facade = new PostOfficeFacade();
        String content = "邮件内容";
        String address = "邮件发送地址";
        facade.sendLetter(content, address);
    }
}
