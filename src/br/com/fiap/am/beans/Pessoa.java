package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Pessoa, onde serão contidos, valores e métodos para o mesmo
 * 
 * Classe usada como heranca para as classes Cliente e Funcionario
 * 
 * @see classe Telefone com método relacionado a esta classe
 * @see classe Endereco com método relacionado a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private Endereco endereco;
	private String dtNascimento;
	private String email;
	private Telefone telefone;

	public Pessoa() {
		super();
	}

	public Pessoa(int codigoPessoa, String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
		this.telefone = telefone;
	}

	public Pessoa(String nome, Endereco endereco, String dtNascimento, String email, Telefone telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
		this.telefone = telefone;

	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
