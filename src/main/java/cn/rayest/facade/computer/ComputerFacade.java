package cn.rayest.facade.computer;

public class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private Disk disk = new Disk();

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }
}
