package projeto.lab.dados;

import java.util.ArrayList;
import java.util.List;

import projeto.lab.entidades.Veiculos;

public class CadastrarVeiculos {

	public List<Veiculos> veiculo = new ArrayList<Veiculos>();

	public CadastrarVeiculos() {

		veiculo.add(new Veiculos(0,"Troller", "T-4 4x4 3.2 20V Tdi Cap. R", "KHL4491", "7wF 6AZ6AR e7 Sa2442",
				"85509462510", 220.55));
		veiculo.add(new Veiculos(1,"Saturn", "SL-2 1.9", "KIZ4222", "6RK 717pEa AJ 314365", "69395495781", 180.65));
		veiculo.add(new Veiculos(2,"Porsche", "911 Carrera 4 coupe 3.0 370cv", "KLF2655", "720 sARA05 7A lZ7015",
				"04452054705", 197.75));
		veiculo.add(
				new Veiculos(3,"Alfa Romeo", "2300 TI/TI-4", "KIX5192", "5LG H8AcPF t9 m61315", "19809668727", 242.35));
		veiculo.add(new Veiculos(4,"Asia Motors", "Topic Super Luxo Diesel", "KLB4022", "80t XMTvA7 S6 Pu3707",
				"27389964460", 165.80));
		veiculo.add(new Veiculos(5,"Nissan", "LIVINA SL 1.6 16V Flex Fuel 5p", "KKO4168", "8RA b6ma82 mY 9R4280",
				"32988383690", 198.70));
		veiculo.add(
				new Veiculos(6,"Buggy", "Buggy 1.6 2-Lug.", "KGX5365", "4u2 XA1bf8 Ec dS0801", "93853997365", 217.60));
		veiculo.add(new Veiculos(7,"Isuzu", "Rodeo 3.2 V6", "KJV0983", "1l9 6mbCAm kx 5j3632", "74017209866", 227.90));
		veiculo.add(new Veiculos(8,"Mahindra", "PIK-UP CS 2.2 4X2 (diesel) Mec.", "KIK2939", "1hL sWjaxS gA x55674",
				"95303340041", 232.70));
		veiculo.add(new Veiculos(9,"HAFEI", "Towner Jr. Pick-up Ba", "KFQ3272", "285 APm0Ar 0u 2F6345", "35872712861",
				189.30));

	}

	public void menoresPrecos() {

		for (Veiculos veiculos : veiculo) {

			if (veiculos.getValorLocacao() <= 200) {

				System.out.println(veiculos.toString());

			}
		}
	}

	public List<Veiculos> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculos> veiculo) {
		this.veiculo = veiculo;
	}

}
