package view;

import control.MoveisFactory;
import model.Moveis;

public class programa {
	
	public static void main(String[] args) {
		
		MoveisFactory factory;
		
		factory = new Moveis();
		Application app = new Application(factory);
		app.print();
 	}

}
