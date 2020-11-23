package Strategy;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("||    TRASPORTADORA ARTBOSS     ||");
			System.out.println("----------------------------------");
			System.out.print("INFROME A DISTÂNCIA EM KM: ");
			int distancia = entrada.nextInt();

			System.out.println("   INFORME O TIPO DE FRETE");
			System.out.println("|1| NORMAL  ");
			System.out.println("|2| SEDEX   ");
			System.out.print(">> ");

			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

			Frete frete = tipoFrete.obterFrete();
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O VALOR TOTAL É DE R$%.2f", preco);
		}
	}
}
