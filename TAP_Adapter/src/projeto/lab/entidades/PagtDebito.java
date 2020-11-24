package projeto.lab.entidades;

import java.text.DecimalFormat;

import projeto.lab.negocio.Validar;
import projeto.lab.util.NumeroLocacao;

public class PagtDebito extends Pagamento {

	private String numeroCartao;
	private Double valorTotal;

	public PagtDebito() {
	}

	public PagtDebito(String numeroCartao, Double valorTotal) {
		this.numeroCartao = numeroCartao;
		this.valorTotal = valorTotal;

	}

	public double valorPagt() {
		return valorTotal;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public boolean validacao() {
		Validar validade = new Validar();
		return validade.numCartao(numeroCartao);
	}

	@Override
	public String toString() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		return "\nValor Total da Locação R$ " + formatador.format(valorPagt())
				+ "\nForma de Pagamento: \nPAGAMENTO CARTAO DE DÉBITO.";
	}

	public void confirma() {
		if (validacao() == true) {
			System.out.println("\nSua Transação foi Aprovada!" + toString());

			NumeroLocacao numLoc = new NumeroLocacao();
			numLoc.confirma();
		} else {
		//	System.out.println("\nSua Transação foi Negada!\n");
		}
	}

}
