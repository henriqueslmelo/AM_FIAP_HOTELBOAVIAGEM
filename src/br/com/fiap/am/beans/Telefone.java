package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Telefone, onde serão contidos, valores e métodos para o mesmo
 * 
 * @see Classe Pessoa Relacionada a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */

public class Telefone {
	
	private String tipoTelefone;
	private int ddd;
	private int numero;

	public Telefone() {
	}

	public Telefone(String tipoTelefone, int ddd, int numero) {
		super();
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
    
} 
