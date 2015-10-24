package br.com.fiap.am.beans;

public class Cliente extends Pessoa {
	private int codigoCliente;
	private String cpf;
	private String rg;
	private int quartoPreferido;
	private int senha;

	public Cliente() {
		super();
	}

	public Cliente(int codigoPessoa, String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone ) {
		super(codigoPessoa, nome, endereco, dtNascimento, email, telefone);
	}

	public Cliente(String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone) {
		super(nome, endereco, dtNascimento, email, telefone);
	}

	public Cliente(int codigoCliente, String cpf, String rg, int quartoPreferido, int senha) {
		super();
		this.codigoCliente = codigoCliente;
		this.cpf = cpf;
		this.rg = rg;
		this.quartoPreferido = quartoPreferido;
		this.senha = senha;
		
	}

	public Cliente(String cpf, String rg, int senha) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.senha = senha;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int getQuartoPreferido() {
		return quartoPreferido;
	}

	public void setQuartoPreferido(int quartoPreferido) {
		this.quartoPreferido = quartoPreferido;
	}


	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}



}
