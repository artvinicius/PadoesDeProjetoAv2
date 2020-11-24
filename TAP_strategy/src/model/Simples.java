package model;

import control.Frete;

public class Simples implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}
	
}