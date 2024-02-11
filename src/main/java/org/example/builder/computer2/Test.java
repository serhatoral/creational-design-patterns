package org.example.builder.computer2;

/*
	Bilgisayarlar parça parça oluştururlur. hangi builder çağrılırsa onun özeliklerine sahip comuter build edilir.

 */
public class Test {

	public static void main(String[] args) {

		Computer bareBoneComputer = Computer.getBaseBuilder("My Computer").buildRAM().buildCPU().buildHardDrive()
				.buildBaseComputer();
		bareBoneComputer.start();

		System.out.println();

		Computer computerWithDisplay = bareBoneComputer.getDisplayBuilder().buildGraphicCard().buildComputerDisplay();
		computerWithDisplay.start();

		System.out.println();

		Computer computerWithDisplayAndAccessories = computerWithDisplay.getAccessoryBuilder().buildKeyboard().buildMouse().buildAccessories();
		computerWithDisplayAndAccessories.start();
	}
}
