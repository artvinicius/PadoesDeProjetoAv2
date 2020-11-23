package view;

import control.MoveisFactory;
import control.Moveis;

public class Application {
	
	private Moveis planejados;
	private Moveis naoPlanejados;
	
	public Application(MoveisFactory factory) {
		planejados = (Moveis) factory.moveisPlanejados();
		naoPlanejados = (Moveis) factory.moveisNaoPlanejados();
	}
	
	public void print() {
		planejados.print();
		naoPlanejados.print();
	}

}
