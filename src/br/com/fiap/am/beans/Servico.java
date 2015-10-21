package br.com.fiap.am.beans;

public class Servico {
	private int codigoServico;
	private String descricaoservico;
	private String tipo;

	public Servico() {
		super();
	}

	public Servico(int codigoServico, String descricaoservico, String tipo) {
		super();
		this.codigoServico = codigoServico;
		this.descricaoservico = descricaoservico;
		this.tipo = tipo;
	}

	public Servico(String descricaoservico, String tipo) {
		super();
		this.descricaoservico = descricaoservico;
		this.tipo = tipo;
	}

	public int getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}

	public String getDescricaoservico() {
		return descricaoservico;
	}

	public void setDescricaoservico(String descricaoservico) {
		this.descricaoservico = descricaoservico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
