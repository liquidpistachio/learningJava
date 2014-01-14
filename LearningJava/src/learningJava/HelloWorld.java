package learningJava;

import javax.swing.*;


public class HelloWorld {

	public static void main(String[] args) {
	//	System.out.println("Hellow,World");
		JFrame frame = new JFrame("Hello, World!");
		frame.add(new HelloComponent() );
		frame.setSize(300,300);
		frame.setVisible(true);
	
	}

}
