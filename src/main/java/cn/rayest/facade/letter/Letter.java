package cn.rayest.facade.letter;

public interface Letter {
    void write(String content);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void send();
}
