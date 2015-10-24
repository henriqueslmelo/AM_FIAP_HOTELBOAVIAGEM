package br.com.fiap.am.beans;

public class Funcionario extends Pessoa {
	private int codigoFuncionario;
	private String dtAdmissao;
	private String cargo;
	

	public Funcionario() {
		super();
	}

	public Funcionario(int codigoPessoa, String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone) {
		super(codigoPessoa, nome, endereco, dtNascimento, email, telefone);
	}

	public Funcionario(String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone) {
		super(nome, endereco, dtNascimento, email, telefone);
	}

	public Funcionario(int codigoFuncionario, String dtAdmissao, String cargo) {
		super();
		this.codigoFuncionario = codigoFuncionario;
		this.dtAdmissao = dtAdmissao;
		this.cargo = cargo;
		
	}


	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


}
