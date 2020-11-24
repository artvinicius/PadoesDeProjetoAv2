package projeto.lab.entidades;

public class CupomDesconto {

	private String codigo;
	private double valorDesc;

	public CupomDesconto() {
	}

	public CupomDesconto(String codigo, double valorDesc) {
		this.codigo = codigo;
		this.valorDesc = valorDesc;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValorDesc() {
		return valorDesc;
	}

	public void setValorDesc(double valorDesc) {
		this.valorDesc = valorDesc;
	}

}
