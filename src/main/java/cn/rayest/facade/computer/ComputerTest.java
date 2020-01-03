package cn.rayest.facade.computer;

public class ComputerTest {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
        facade.shutdown();
    }
}
