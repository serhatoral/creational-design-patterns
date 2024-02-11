package org.example.builder.computer2;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public Computer buildBaseComputer();

}
