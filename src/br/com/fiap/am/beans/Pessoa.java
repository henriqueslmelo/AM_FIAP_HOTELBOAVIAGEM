package br.com.fiap.am.beans;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private Endereco endereco;
	private String dtNascimento;
	private String email;

	public Pessoa() {
		super();
	}

	public Pessoa(int codigoPessoa, String nome, Endereco endereco, String dtNascimento, String email) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
	}

	public Pessoa(String nome, Endereco endereco, String dtNascimento, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
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

}
