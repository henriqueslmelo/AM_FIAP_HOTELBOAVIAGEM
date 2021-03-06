package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Cliente, onde ser�o contidos, valores e m�todos para o mesmo
 * 
 * @see Classe Pessoa Relacionada a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */
public class Cliente extends Pessoa {
	private int codigoCliente;
	private String cpf;
	private String rg;
	private int quartoPreferido;
	private String dsSenha;

	public Cliente() {
		super();
	}

	public Cliente(int codigoPessoa, String nome, Endereco endereco,
			String dtNascimento, String email, Telefone telefone) {
		super(codigoPessoa, nome, endereco, dtNascimento, email, telefone);
	}

	public Cliente(String nome, Endereco endereco, String dtNascimento,
			String email, Telefone telefone) {
		super(nome, endereco, dtNascimento, email, telefone);
	}

	public Cliente(int codigoCliente, String cpf, String rg,
			int quartoPreferido, String dsSenha) {
		super();
		this.codigoCliente = codigoCliente;
		this.cpf = cpf;
		this.rg = rg;
		this.quartoPreferido = quartoPreferido;
		this.dsSenha = dsSenha;

	}

	public Cliente(String cpf, String rg, int senha, String dsSenha) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.dsSenha = dsSenha;
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

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

}
