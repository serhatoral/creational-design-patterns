package org.example.builder.computer3;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public ComputerDisplayBuilderI buildBaseComputer();

}
