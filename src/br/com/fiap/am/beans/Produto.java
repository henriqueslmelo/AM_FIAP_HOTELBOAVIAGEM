package br.com.fiap.am.beans;

public class Produto {
	private int codigoProduto;
	private String descricaoProduto;
	private String tipo;

	public Produto() {
		super();
	}

	public Produto(int codigoProduto, String descricaoProduto, String tipo) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.tipo = tipo;
	}

	public Produto(String descricaoProduto, String tipo) {
		super();
		this.descricaoProduto = descricaoProduto;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
