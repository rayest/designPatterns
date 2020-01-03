package cn.rayest.facade;

import cn.rayest.facade.letter.impl.LetterImpl;
import cn.rayest.facade.letter.Letter;

public class PostOfficeFacade {
    private Letter letter = new LetterImpl();
    private Police police = new Police();
    public void sendLetter(String content, String address) {
        letter.write(content);
        letter.fillEnvelope(address);
        police.check(letter);
        letter.letterIntoEnvelope();
        letter.send();
    }
}
