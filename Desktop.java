package org.system;

public class Desktop {

		public void desktopSize() {
		System.out.println("size is 15.60inch");
}
		public static void main(String[] args) {
			Computer computer = new Computer();
			Desktop desktop = new Desktop();
			computer.computerModel();
			desktop.desktopSize();
		}
	}
	
