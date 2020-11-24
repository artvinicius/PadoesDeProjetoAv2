package projeto.lab.entidades;

public class Veiculos {

	private int codigo;
	private String placa;
	private String chassi;
	private String modelo;
	private String marca;
	private double valorLocacao;
	private String renavam;

	public Veiculos() {
	}

	public Veiculos(int codigo, String marca, String modelo, String placa, String chassi, String renavam, double valorLocacao) {
		this.codigo = codigo;
		this.chassi = chassi;
		this.modelo = modelo;
		this.placa = placa;
		this.renavam = renavam;
		this.marca = marca;
		this.valorLocacao = valorLocacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	@Override
	public String toString() {
		return " - CODIGO: " + codigo + " | MARCA: " + marca + " | MODELO: " + modelo  + " | VALOR LOCAÇÃO: R$ " + valorLocacao;
	}

}
