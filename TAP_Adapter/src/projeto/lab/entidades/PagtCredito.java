package projeto.lab.entidades;

import java.text.DecimalFormat;

import projeto.lab.negocio.Validar;
import projeto.lab.util.NumeroLocacao;

public class PagtCredito extends Pagamento {

	private String numeroCartao;
	private Double valorTotal;
	private Integer parcela;

	public PagtCredito(String numeroCartao, Double valorTotal, Integer parcela) {
		this.numeroCartao = numeroCartao;
		this.valorTotal = valorTotal;
		this.parcela = parcela;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Double getValor() {
		return valorTotal;
	}

	public Integer getParcela() {
		return parcela;
	}

	public Double valorPorParcela() {
		return valorTotal / parcela;
	}

	public boolean validacao() {
		Validar validar = new Validar();
		return validar.numCartao(numeroCartao);
	}

	public String toString() {

		DecimalFormat formatador = new DecimalFormat("0.00");
		return "\nValor Total da Locação R$ " + formatador.format(valorTotal)
				+ "\nForma de Pagamento: \nCARTÃO DE CRÉDITO - " + parcela + "x de R$ " + valorPorParcela() + " cada.";
	}

	@Override
	public void confirma() {

		if (validacao() == true) {
			System.out.println("\nSua Transação foi Aprovada!" + toString());

			NumeroLocacao numLoc = new NumeroLocacao();
			numLoc.confirma();

		} else {
			//System.out.println("\nSua Transação foi Negada!\n");
		}
	}

}
