package projeto.lab.apresentacao;

import projeto.lab.dados.CadastrarVeiculos;
import projeto.lab.entidades.Veiculos;

public class ListaVeiculos {

	public static void main(String[] args) {

		CadastrarVeiculos v = new CadastrarVeiculos();
		System.out.println("****OFERTAS****");
		v.menoresPrecos();

		System.out.println("\nLISTA DE VEÍCULOS:");
		for (Veiculos listaV : v.veiculo) {
			System.out.println(listaV.toString());

		}
	}
}
