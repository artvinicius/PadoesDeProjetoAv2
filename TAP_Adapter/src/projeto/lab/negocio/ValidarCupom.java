package projeto.lab.negocio;

public class ValidarCupom {

	public boolean validaCupom(String codigo) {

		switch (codigo) {
		case "DESC10":

			return true;

		case "DESC20":

			return true;
		case "DESC30":

			return true;

		default:
			return false;

		}

	}

}
