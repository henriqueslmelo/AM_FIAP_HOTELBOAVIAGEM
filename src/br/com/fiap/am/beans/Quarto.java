package br.com.fiap.am.beans;

public class Quarto {
	private int codigoQuarto;
	private int nrQuarto;
	private TipoQuarto tipoQuarto;
	private int andar;
	private int capacidade;

	public Quarto() {
		super();
	}

	public Quarto(int codigoQuarto, int nrQuarto, TipoQuarto tipoQuarto, int andar, int capacidade) {
		super();
		this.codigoQuarto = codigoQuarto;
		this.nrQuarto = nrQuarto;
		this.tipoQuarto = tipoQuarto;
		this.andar = andar;
		this.capacidade = capacidade;
	}

	public Quarto(int nrQuarto, TipoQuarto tipoQuarto, int andar, int capacidade) {
		super();
		this.nrQuarto = nrQuarto;
		this.tipoQuarto = tipoQuarto;
		this.andar = andar;
		this.capacidade = capacidade;
	}

	public int getCodigoQuarto() {
		return codigoQuarto;
	}

	public void setCodigoQuarto(int codigoQuarto) {
		this.codigoQuarto = codigoQuarto;
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
