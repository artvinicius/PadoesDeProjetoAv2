package projeto.lab.entidades;

import java.io.Serializable;

public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	private String cnh;

	public Clientes() {
	}

	public Clientes(String nome, String cpf, String telefone, String endereco, String cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = endereco;
		this.cnh = cnh;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return cep;
	}

	public void setEndereco(String endereco) {
		this.cep = endereco;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "DADOS DO CLIENTE:\nNome: " + getNome() + " | CPF: " + getCpf() + " | CNH: " + getCnh() + " | Telefone: " + getTelefone()
				+ " | Endereço: " + getTelefone();
	}
}
