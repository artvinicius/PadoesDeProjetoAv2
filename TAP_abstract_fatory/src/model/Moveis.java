package model;

import control.MoveisFactory;
import control.MoveisNaoPlanejadosFactory;
import control.MoveisPlanejadosFactory;

public class Moveis implements MoveisFactory{
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moveis [tipo=" + tipo + "]";
	}

	@Override
	public MoveisPlanejadosFactory moveisPlanejados() {
		return new MoveisPlanejadosFactory();
		
	}

	@Override
	public control.Moveis moveisNaoPlanejados() {
		return new MoveisNaoPlanejadosFactory();
		
	}

}
