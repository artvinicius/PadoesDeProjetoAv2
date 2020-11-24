package projeto.lab.dados;

import java.util.ArrayList;
import java.util.List;

import projeto.lab.entidades.CupomDesconto;

public class CadastroCupom {

	public List<CupomDesconto> cupomDesconto = new ArrayList<CupomDesconto>();

	public CadastroCupom() {

		cupomDesconto.add(new CupomDesconto("DESC10", 0.1));
		cupomDesconto.add(new CupomDesconto("DESC20", 0.2));
		cupomDesconto.add(new CupomDesconto("DESC30", 0.3));
	}

}
