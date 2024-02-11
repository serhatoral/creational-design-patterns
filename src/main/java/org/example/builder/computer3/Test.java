package org.example.builder.computer3;


/*
	Burada build ile oluşturulan nesne bir sonraki build yapısını döndürür.
	Örneğin;
		ComputerDisplayBuilderI displayBuilder = baseBuilder.buildRAM().buildCPU().buildHardDrive()
				.buildBaseComputer();

	buildBaseComputer methodu base computer'dan sonraki bir üst yapı olan display computer'ı çağırıyor.

 */
public class Test {

	public static void main(String[] args) {
		BaseComputerBuilderI baseBuilder = Computer.getBaseBuilder("My Computer");

		ComputerDisplayBuilderI displayBuilder = baseBuilder.buildRAM().buildCPU().buildHardDrive()
				.buildBaseComputer();

		AccessoryBuilderI accessoryBuilder = displayBuilder.buildGraphicCard().buildComputerDisplay();

		Computer computerWithDisplayAndAccessories = accessoryBuilder.buildKeyboard().buildMouse().build();
		
		computerWithDisplayAndAccessories.start();
	}
}
