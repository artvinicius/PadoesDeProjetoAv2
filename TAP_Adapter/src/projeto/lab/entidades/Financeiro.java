package projeto.lab.entidades;

public class Financeiro {

	public double calcularMontante(double quantiaOriginal, double numMeses) {

		double valorFinal = (quantiaOriginal * 0.2 * numMeses) + quantiaOriginal;
		return valorFinal;

	}
}
