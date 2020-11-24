package view;

import control.MoveisFactory;
import control.Moveis;

public class Application {
	
	private Moveis planejados;
	private Moveis naoPlanejados;
	
	public Application(MoveisFactory factory) {
		planejados = factory.moveisPlanejados();
		naoPlanejados = factory.moveisNaoPlanejados();
	}
	
	public void printPlanejados() {
		planejados.print();
	}
	
	public void printNaoPlanejados() {
		naoPlanejados.print();
	}

}
