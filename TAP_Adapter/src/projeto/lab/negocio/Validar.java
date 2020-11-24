package projeto.lab.negocio;

public class Validar {

	public boolean numCartao(String numcartao) {
		boolean valida = numcartao.matches("[0-9]+");
		return valida;
	}


}
