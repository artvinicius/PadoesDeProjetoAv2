package projeto.lab.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import projeto.lab.entidades.Clientes;

public class Crud {

	static String dir = "src/clienteCpf";

	public static void cadastrar(String[] user) throws FileNotFoundException, IOException {
		File arquivo = new File(dir + user[1].toLowerCase() + ".txt");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
		out.writeObject(new Clientes(user[0], user[1], user[2], user[3], user[4]));
		out.close();

	}

	public static void remover(String cpf) throws FileNotFoundException, IOException, ClassNotFoundException {
		File arquivo = new File(dir + cpf.toLowerCase() + ".txt");
		arquivo.delete();

	}

	public static void buscar(String cpf) throws ClassNotFoundException, IOException {

		File arquivo = new File(dir + cpf.toLowerCase() + ".txt");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
		Clientes clienteObj = (Clientes) in.readObject();
		System.out.println(clienteObj);
		in.close();

	}

	public static void editar(String[] user) throws ClassNotFoundException, IOException {
		File arquivo = new File(dir + user[1].toLowerCase() + ".txt");
		FileOutputStream up = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(up);
		oos.writeObject(new Clientes(user[0], user[1], user[2], user[3], user[4]));
		oos.flush();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
		Clientes clienteObj = (Clientes) in.readObject();
		System.out.println(clienteObj);

		in.close();
		oos.close();

	}

}
