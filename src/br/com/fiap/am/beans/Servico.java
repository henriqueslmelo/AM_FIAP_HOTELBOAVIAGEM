package br.com.fiap.am.beans;

public class Servico {
	private int codigoServico;
	private String descricaoServico;
	private int nrTipo;

	public Servico() {
		super();
	}

	public Servico(int codigoServico, String descricaoServico, int nrTipo) {
		super();
		this.codigoServico = codigoServico;
		this.descricaoServico = descricaoServico;
		this.setNrTipo(nrTipo);
	}

	public Servico(String descricaoServico, int nrTipo) {
		super();
		this.descricaoServico = descricaoServico;
		this.setNrTipo(nrTipo);
	}

	public int getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public int getNrTipo() {
		return nrTipo;
	}

	public void setNrTipo(int nrTipo) {
		this.nrTipo = nrTipo;
	}


}
