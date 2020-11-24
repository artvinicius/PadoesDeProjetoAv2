package projeto.lab.entidades;

import java.text.DecimalFormat;

import projeto.lab.dados.CadastroCupom;
import projeto.lab.negocio.ValidarCupom;
import projeto.lab.util.NumeroLocacao;

public class PagtCupomDesconto extends Pagamento {

	private String numeroCartao;
	private Double valorTotal;
	private String cupomDesc;

	public PagtCupomDesconto() {
	}

	public PagtCupomDesconto(String numeroCartao, Double valorTotal, String cupomDesc) {
		this.numeroCartao = numeroCartao;
		this.valorTotal = valorTotal;
		this.cupomDesc = cupomDesc;
	}

	public double valorPagt() {
		CadastroCupom cc = new CadastroCupom();

		for (CupomDesconto desc : cc.cupomDesconto) {

			if (desc.getCodigo().equals(cupomDesc)) {

				return (valorTotal) - (valorTotal * desc.getValorDesc());

			}
		}
		return valorTotal;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public boolean validaCupom() {
		ValidarCupom validar = new ValidarCupom();
		return validar.validaCupom(cupomDesc);
	}

	public double valorDesconto() {

		double economia = valorTotal - valorPagt();

		return economia;
	}

	@Override
	public String toString() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		return "\nValor Total da Locação R$ " + formatador.format(valorPagt()) + "\nVocê ganhou R$ "
				+ formatador.format(valorDesconto()) + " de desconto!\nForma de Pagamento: \nCARTÃO DE DÉBITO.";
	}

	public void confirma() {
		if (validaCupom() == true) {
			System.out.println("\nSua Transação foi Aprovada!" + toString());

			NumeroLocacao numLoc = new NumeroLocacao();
			numLoc.confirma();
		} else {
			System.out.println("\nCupom Inválido! Sua Transação foi Negada!\n");
		}
	}

}
