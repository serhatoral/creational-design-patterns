package org.example.builder.computer1;


public class Test {

	public static void main(String[] args) {
		
		Computer bareBoneComputer = Computer.getBuilder("bare-bone computer").buildCPU().buildRAM().buildHardDrive().build();
		bareBoneComputer.start();
		
		System.out.println();
		
		Computer.getBuilder("another computer").buildCPU().buildRAM().buildHardDrive().build().start();
		


	}
}
