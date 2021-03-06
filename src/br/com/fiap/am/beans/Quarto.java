package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Quarto, onde ser�o contidos, valores e m�todos para o mesmo
 * 
 * @see Classe TipoQuarto Relacionada a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */

public class Quarto {
	private int nrQuarto;
	private TipoQuarto tipoQuarto;
	private int andar;
	private int capacidade;

	public Quarto() {
		super();
	}

	public Quarto(int nrQuarto, TipoQuarto tipoQuarto, int andar, int capacidade) {
		super();
		this.nrQuarto = nrQuarto;
		this.tipoQuarto = tipoQuarto;
		this.andar = andar;
		this.capacidade = capacidade;
	}


	public int getNrQuarto() {
		return nrQuarto;
	}

	public void setNrQuarto(int nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
