package org.example.builder.computer1;

public interface ComputerBuilderI {

    public ComputerBuilderI buildRAM();

    public ComputerBuilderI buildCPU();

    public ComputerBuilderI buildHardDrive();

    public ComputerBuilderI buildGraphicCard();

    public ComputerBuilderI buildDisplay();

    public ComputerBuilderI buildMouse();

    public ComputerBuilderI buildKeyboard();

    public Computer build();
}
