package projeto.lab.util;

import java.util.Random;

import projeto.lab.entidades.Pagamento;

public class NumeroLocacao extends Pagamento {

	public Integer numPedido() {
		Random gerador = new Random();
		return gerador.nextInt(9999);
	}

	@Override
	public void confirma() {
		System.out.println("\nLocação N° " + numPedido() + 2020);
	}
}
