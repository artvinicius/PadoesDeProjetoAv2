package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Frete;
import control.TipoFrete;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("    C�LCULO DE FRETE   ");
			System.out.println(" --  --  --  --  --  --  --  -- ");
			System.out.print("INFROME A DIST�NCIA EM KM: ");
			int distancia = entrada.nextInt();

			System.out.print("   INFORME O TIPO DE FRETE \n"
					+ "|0| SIMPLES \n"
					+ "|1| EXPRESS \n"
					+ ">> ");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete];

			Frete frete = tipoFrete.obterFrete(); // Strategy
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O VALOR TOTAL � DE R$%.2f", preco);
		
		
		} catch (InputMismatchException e) {
			System.out.println("__________________________________");
			System.out.println("ERROR  >> DIGITE APENAS N�MEROS !");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("___________________________________________________");
			System.out.println("ERROR  >> DIGITE APENAS N�MEROS V�LIDOS ! (0 ou 1)");

		}
	}
}