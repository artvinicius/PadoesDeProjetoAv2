package view;

import java.util.Scanner;

import control.MoveisFactory;
import model.Moveis;

public class Menu {
	
	static Scanner T = new Scanner(System.in);
	
	 int opcao;
	boolean resultado = false;
	
	public void menu() {

		while (!resultado) {
			System.out.println("++++++++++ BEM VINDO +++++++++++");
			System.out.println("|   [1] - Realizar compras     |");
			System.out.println("|   [0] - Sair do Sistema      |");
			System.out.println("++++++++++++++++++++++++++++++++");
			System.out.println("");
			System.out.print("Digite uma opcao: ");
			opcao = T.nextInt();
			
			boolean validacao = true;

			if (validacao) {

				if (opcao >= 0 && opcao <= 2) {
					opcoesMenu(opcao);
					resultado = true;
				} else {
					System.out.println("ATENCAO!!! Opcao Invalida!");
				}
			}
		}
	}
	
	public void opcoesMenu(int opcao) {

		switch (opcao) {
		case 1:
			menuMoveis();
			break;
		case 0:
			sairDoSistema();
			break;
		default:
			break;
		}
	}
	
	private static void sairDoSistema() {
		System.out.println("Sistema Encerrado!");
		System.exit(0);
	}
	
	public void opcoesMenu2(int opcao) {
		
		MoveisFactory factory;
		
		factory = new Moveis();
		Application app = new Application(factory);
		
		switch (opcao) {
		case 1:
			app.printPlanejados();
			break;
		case 2:
			app.printNaoPlanejados();
			break;
		case 0:
			menu();
			break;
		default:
			break;
		}
	}

	private void menuMoveis() {
		
		while (!resultado) {
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println("|   [1] - Moveis Planejados         |");
			System.out.println("|   [2] - Moveis não Planejados     |");
			System.out.println("|   [0] - Voltar                    |");
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println("");
			System.out.print("Digite uma opcao: ");
			opcao = T.nextInt();
			
			boolean validacao = true;

			if (validacao) {

				if (opcao >= 0 && opcao <= 2) {
					opcoesMenu2(opcao);
					resultado = true;
				} else {
					System.out.println("ATENCAO!!! Opcao Invalida!");
				}
			}
		}
	}

}
