package br.com.fiap.am.beans;

public class Produto {
	private int codigoProduto;
	private String descricaoProduto;
	private int nrTipo;

	public Produto() {
		super();
	}

	public Produto(int codigoProduto, String descricaoProduto, int nrTipo) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.setNrTipo(nrTipo);
	}

	public Produto(String descricaoProduto, int nrTipo) {
		super();
		this.descricaoProduto = descricaoProduto;
		this.setNrTipo(nrTipo);
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getNrTipo() {
		return nrTipo;
	}

	public void setNrTipo(int nrTipo) {
		this.nrTipo = nrTipo;
	}

}
