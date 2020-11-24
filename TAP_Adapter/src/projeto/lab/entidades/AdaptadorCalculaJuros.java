package projeto.lab.entidades;

public class AdaptadorCalculaJuros extends CalculaJuros {

	Financeiro quantiaEmAdaptacao = null;

	public AdaptadorCalculaJuros(Financeiro quantiaEmAdaptacao) {
		super();
		this.quantiaEmAdaptacao = quantiaEmAdaptacao;
	}

	public double quantia(double quantiaOriginal, double numAnos) {
		return quantiaEmAdaptacao.calcularMontante(super.getQuantiaOriginal(), super.getNumAnos());
	}

}
