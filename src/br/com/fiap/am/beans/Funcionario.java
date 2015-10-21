package br.com.fiap.am.beans;

public class Funcionario extends Pessoa {
	private int codigoFuncionario;
	private int senha;

	public Funcionario() {
		super();
	}

	public Funcionario(int codigoPessoa, String nome, Endereco endereco, String dtNascimento, String email) {
		super(codigoPessoa, nome, endereco, dtNascimento, email);
	}

	public Funcionario(String nome, Endereco endereco, String dtNascimento, String email) {
		super(nome, endereco, dtNascimento, email);
	}

	public Funcionario(int codigoFuncionario, int senha) {
		super();
		this.codigoFuncionario = codigoFuncionario;
		this.senha = senha;
	}

	public Funcionario(int senha) {
		super();
		this.senha = senha;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
