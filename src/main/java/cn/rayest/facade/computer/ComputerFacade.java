package cn.rayest.facade.computer;

import cn.rayest.facade.computer.impl.CPU;
import cn.rayest.facade.computer.impl.Disk;
import cn.rayest.facade.computer.impl.Memory;

public class ComputerFacade {
    private Computer cpu = new CPU();
    private Computer memory = new Memory();
    private Computer disk = new Disk();

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
