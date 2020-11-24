package projeto.lab.apresentacao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.lab.dados.Crud;
import projeto.lab.entidades.Financeiro;
import projeto.lab.entidades.Locar;
import projeto.lab.entidades.Pagamento;
import projeto.lab.entidades.PagtCredito;
import projeto.lab.entidades.PagtDebito;

public class AcessarPrograma {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		menu();

	}

	public static void menu() throws FileNotFoundException, IOException, ClassNotFoundException {

		System.out.println("\n\n               LOCAÇÃO DE VEÍCULOS");
		System.out.println("                 Seja Bem Vindo!");
		System.out.println("\n         Você está no Painel do Cliente");
		System.out.println("__________________________________________________________");
		System.out.println("\nMenu:");
		System.out.println("   1 - Acessar Painel do Cliente\n   2 - Realizar Cadastro\n");
		System.out.print("Insira aqui: ");
		int menu1 = entrada.nextInt();

		switch (menu1) {

		// ACESSAR PAINEL DO CLIENTE
		case 1:
			menu2();
			break;

		// REALIZAR CADASTRO
		case 2:
			cadastrar();
			break;
		}
	}

	public static void menu2() throws FileNotFoundException, IOException, ClassNotFoundException {

		entrar();
		System.out.println("\n_________PAINEL DO CLIENTE_________");
		System.out.println("\nMenu:\n   1 - Realizar Locação\n   2 - Atualizar Cadastro\n   3 - Excluir Conta\n");
		System.out.println("\nInsira aqui: ");
		int menu2 = entrada.nextInt();

		switch (menu2) {

		// REALIZAR LOCAÇÃO
		case 1:
			locar();
			break;

		// ATUALIZAR CADASTRO
		case 2:
			Editar.atualizar();
			break;

		// EXCLUIR CADASTRO
		case 3:
			Editar.deletar();
			break;

		default:
			System.out.println("Opção Inválida!");
			break;
		}

	}

	public static void entrar() throws ClassNotFoundException, IOException {

		System.out.println("\n_________LOGIN DO USUÁRIO_________");
		System.out.print("\nCPF: ");
		String cpf = entrada.next();
		Crud.buscar(cpf);

	}

	public static void cadastrar() throws FileNotFoundException, IOException, ClassNotFoundException {

		System.out.println("\n_________TELA DE CADASTRO_________");
		System.out.println("\nDados do Cliente:");
		System.out.print("Nome: ");
		String nomeCliente = entrada.next();

		System.out.print("CPF: ");
		String cpfCliente = entrada.next();

		System.out.print("Telefone: ");
		String telefoneCliente = entrada.next();

		System.out.print("CEP: ");
		String enderecoCliente = entrada.next();

		System.out.print("CNH: ");
		String cnhCliente = entrada.next();

		String user[] = { nomeCliente, cpfCliente, telefoneCliente, enderecoCliente, cnhCliente };
		Crud.cadastrar(user);

		System.out.println(" ");
		Crud.buscar(cpfCliente);
		System.out.println("Cadastro Realizado com sucesso!");

	}

	public static void pagamento(double valorTotal) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o tipo de pagamento:");
		System.out.print("   1- Debito\n   2- Credito");
		int tipo = entrada.nextInt();

		switch (tipo) {
		case 1:

			Pagamento debito = new PagtDebito("1234", valorTotal);
			debito.confirma();

			break;

		case 2:
			System.out.println("Selecione um tipo de pagamento:");
			System.out.print("   1- Crédito a vista SEM juros\n   2- Crédito parcelado COM juros");
			int opc = entrada.nextInt();

			switch (opc) {

			case 1:
				Pagamento cr = new PagtCredito("1234", valorTotal, 1);
				cr.confirma();
				break;

			case 2:
				System.out.print("Quantidade de parcelas:");
				int parc = entrada.nextInt();
				Financeiro financeiro = new Financeiro();

				double total = financeiro.calcularMontante(valorTotal, parc);

				Pagamento przo = new PagtCredito("1234", total, parc);
				przo.confirma();

				break;

			default:
				break;
			}

		default:
			System.out.println("\nTransacao inválida!");
			break;
		}

		entrada.close();
	}

	static class Editar {
		public static void atualizar() throws ClassNotFoundException, IOException {

			System.out.println("\n_______TELA DE ATUALIZAÇÃO________");
			System.out.print("\nNome: ");
			String nomeCliente = entrada.next();

			System.out.print("CPF: ");
			String cpfCliente = entrada.next();

			System.out.print("Telefone: ");
			String telefoneCliente = entrada.next();

			System.out.print("Endereço: ");
			String enderecoCliente = entrada.next();

			System.out.print("CNH: ");
			String cnhCliente = entrada.next();

			String user[] = { nomeCliente, cpfCliente, telefoneCliente, enderecoCliente, cnhCliente };

			System.out.println(" ");
			Crud.editar(user);

			System.out.println("Dados Atualizados com Sucesso!");

		}

		public static void deletar() throws ClassNotFoundException, IOException {

			System.out.println("\n_______TELA DE CANCELAMENTO________");
			System.out.print("\nConfirme seu CPF para Remover sua Conta: ");
			String cpf = entrada.next();
			System.out.println(" ");
			Crud.buscar(cpf);
			Crud.remover(cpf);

			System.out.println("Dados Removidos com Sucesso!");

		}
	}

	public static void locar() throws ClassNotFoundException, IOException {

		Scanner entrada = new Scanner(System.in);

		Locar[] locacao = new Locar[10];

		System.out.println(
				"\n______________________________________TELA DE LOCAÇÃO______________________________________");
		System.out.println("\nVEICULOS DISPONIVEIS:");
		System.out.println("");

		for (int i = 0; i < locacao.length; i++) {

			locacao[i] = new Locar();
			System.out.println("Código: " + (i) + " | MARCA: " + locacao[i].marca[i] + " | MODELO: "
					+ locacao[i].modelo[i] + " | VALOR DE LOCAÇÃO: R$ " + locacao[i].valor[i]);
		}

		int num = 1;

		List<Double> listaValoresVeiculos = new ArrayList<Double>();

		while (num != 2) {
			System.out.print("\nDigite o Código do Veículo que deseja locar: ");
			int cod = entrada.nextInt();

			System.out.print("Digite a quantidade de dias que deseja locar este Veículo: ");
			int dias = entrada.nextInt();

			for (int i = 0; i < locacao.length; i++) {
				locacao[i] = new Locar();

				if (cod == i) {

					double valorTotal = locacao[cod].valor[cod] * dias;

					listaValoresVeiculos.add(valorTotal);
				}

			}
			System.out.println("\nDeseja Locar outro veiculo?\n   1 - Sim\n   2 - Não");
			num = entrada.nextInt();

		}
		double total = 0;

		for (int i = 0; i < listaValoresVeiculos.size(); i++) {
			total += listaValoresVeiculos.get(i);
		}

		pagamento(total);

		entrada.close();

	}

}
