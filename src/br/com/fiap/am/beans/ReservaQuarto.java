package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo ReservaQuarto, onde serão contidos, valores e métodos para o mesmo
 * 
 * @see Classe Reserva com metodo relacionado a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class ReservaQuarto {
	
	private int codigoReservaQuarto;
	private int nrQuarto;
	private int qtdePessoaQuarto;
	private String dsObservacao;
	private TipoQuarto tipoQuarto;

	public ReservaQuarto() {
	}

	public ReservaQuarto(int codigoReserva, int nrQuarto,
			int qtdePessoaQuarto, String dsObservacao, TipoQuarto tipoQuarto) {
		super();
		this.codigoReservaQuarto = codigoReserva;
		this.nrQuarto = nrQuarto;
		this.qtdePessoaQuarto = qtdePessoaQuarto;
		this.dsObservacao = dsObservacao;
	}

	public int getNrQuarto() {
		return nrQuarto;
	}

	public void setNrQuarto(int nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

	public int getQtdePessoaQuarto() {
		return qtdePessoaQuarto;
	}

	public void setQtdePessoaQuarto(int qtdePessoaQuarto) {
		this.qtdePessoaQuarto = qtdePessoaQuarto;
	}

	public String getDsObservacao() {
		return dsObservacao;
	}

	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}

	public int getCodigoReservaQuarto() {
		return codigoReservaQuarto;
	}

	public void setCodigoReservaQuarto(int codigoReservaQuarto) {
		this.codigoReservaQuarto = codigoReservaQuarto;
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
   
	
}
