package org.example.builder.computer1;

import org.example.builder.model.*;

public class Computer {

    private String name;
    private CPU cpu;
    private RAM ram;
    private HardDrive hd;
    private GraphicCard graphicCard;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
                     Keyboard keyboard) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
                     Keyboard keyboard, Mouse mouse) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    private Computer() {
    }


    public void start() {
        cpu.start();
        ram.loadOSKernelImage();
        ram.loadOS();
        ram.loadDrivers();
        ram.startServices();
        hd.start();
        if (graphicCard != null)
            graphicCard.start();
        if (display != null)
            display.start();
        if (keyboard != null)
            keyboard.start();
        if (mouse != null)
            mouse.start();
        System.out.println("Computer " + name + " has started.\n");
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDrive getHd() {
        return hd;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public static ComputerBuilderI getBuilder(String name) {
        return new ComputerBuilder(name);
    }

    public static class ComputerBuilder implements ComputerBuilderI {
        private String name;

        private boolean hasRam;
        private boolean hasCPU;
        private boolean hasHD;
        private boolean hasGC;
        private boolean hasDisplay;
        private boolean hasMouse;
        private boolean hasKeyboard;

        private Computer computer;

        private ComputerBuilder(String name) {
            this.name = name;
        }

        @Override
        public ComputerBuilderI buildRAM() {
            hasRam = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildCPU() {
            hasCPU = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildHardDrive() {
            hasHD = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildGraphicCard() {
            hasGC = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildDisplay() {
            hasDisplay = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildMouse() {
            hasMouse = true;
            return this;
        }

        @Override
        public ComputerBuilderI buildKeyboard() {
            hasKeyboard = true;
            return this;
        }

        @Override
        public Computer build() {
            computer = new Computer();
            computer.name = name;

            if (hasRam) {
                RAM ram = new RAM();
                computer.ram = ram;
            }

            if (hasCPU) {
                CPU cpu = new CPU();
                computer.cpu = cpu;
            }

            if(hasHD) {
                HardDrive hd = new HardDrive();
                computer.hd = hd;
            }

            if(hasGC) {
                GraphicCard graphicCard = new GraphicCard();
                computer.graphicCard = graphicCard;
            }

            if(hasDisplay) {
                Display display = new Display();
                computer.display = display;
            }

            if(hasMouse) {
                Mouse mouse = new Mouse();
                computer.mouse = mouse;
            }

            if(hasKeyboard) {
                Keyboard keyboard = new Keyboard();
                computer.keyboard = keyboard;
            }
            return computer;
        }
    }

}
