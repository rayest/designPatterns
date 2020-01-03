package cn.rayest.facade.letter.impl;

import cn.rayest.facade.letter.Letter;

public class LetterImpl implements Letter {
    @Override
    public void write(String content) {
        System.out.println("填写信的内容: " + content);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写信封上的地址：" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("写完之后，将信装进信封");
    }

    @Override
    public void send() {
        System.out.println("投递信件");
    }
}
