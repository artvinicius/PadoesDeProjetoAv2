package projeto.lab.entidades;

public abstract class CalculaJuros {
	
	private double quantiaOriginal;
	private double numMeses;
	private double taxaJuros = 0.2;
	
	public double quantia(double quantiaOriginal, double numMeses) {
		double valorFinal = quantiaOriginal *  numMeses * this.taxaJuros;
		System.out.printf("Valor Juros: %.2f",valorFinal);
		return valorFinal;
	}

	public double getQuantiaOriginal() {
		return quantiaOriginal;
	}

	public void setQuantiaOriginal(double quantiaOriginal) {
		this.quantiaOriginal = quantiaOriginal;
	}

	public double getNumAnos() {
		return numMeses;
	}

	public void setNumAnos(double numAnos) {
		this.numMeses = numAnos;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

}
