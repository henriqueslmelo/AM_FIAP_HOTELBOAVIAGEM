package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Funcionários, onde serão contidos, valores e métodos para o mesmo
 * 
 * @see Classe Hospedagem com metodo relacionado a esta classe
 * @see Classe Funcionario com metodo relacionado a esta classe
 * @see Classe Servico com metodo relacionado a esta classe
 * @see Classe Produto com metodo relacionado a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class Consumo {
	private int codigoConsumo;
	private int quantidade;
	private Hospedagem hospedagem;
	private Funcionario funcionario;
	private Produto produto;
	private Servico servico;
	private String dataConsumo;

	

	public Consumo() {
		super();
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto,
			Servico servico, String dataConsumo) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
		this.servico = servico;
		this.dataConsumo = dataConsumo;
	}

	public Consumo(int quantidade, Hospedagem hospedagem, Funcionario funcionario, Servico servico, String dataConsumo) {
		super();
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.servico = servico;
		this.dataConsumo = dataConsumo;
	}

	public Consumo(int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto, String dataConsumo) {
		super();
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Produto produto, String dataConsumo) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.produto = produto;
		this.dataConsumo = dataConsumo;
	}

	public Consumo(int codigoConsumo, int quantidade, Hospedagem hospedagem, Funcionario funcionario, Servico servico, String dataConsumo) {
		super();
		this.codigoConsumo = codigoConsumo;
		this.quantidade = quantidade;
		this.hospedagem = hospedagem;
		this.funcionario = funcionario;
		this.servico = servico;
		this.dataConsumo = dataConsumo;
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

	public String getDataConsumo() {
		return dataConsumo;
	}

	public void setDataConsumo(String dataConsumo) {
		this.dataConsumo = dataConsumo;
	}

}
