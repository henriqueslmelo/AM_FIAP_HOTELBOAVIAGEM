package br.com.fiap.am.beans;

public class Consumo {
	private int codigoConsumo;
	private int quantidade;
	private Hospedagem hospedagem;
	private Funcionario funcionario;
	private Produto produto;
	private Servico servico;

	public Consumo() {
		super();
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto,
			Servico servico) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
		this.servico = servico;
	}

	public Consumo(int quantidade, Hospedagem hospedagem, Funcionario funcionario, Servico servico) {
		super();
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.servico = servico;
	}

	public Consumo(int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Servico servico) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.servico = servico;
	}

	public int getCodigoConsumo() {
		return codigoConsumo;
	}

	public void setCodigoConsumo(int codigoConsumo) {
		this.codigoConsumo = codigoConsumo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
