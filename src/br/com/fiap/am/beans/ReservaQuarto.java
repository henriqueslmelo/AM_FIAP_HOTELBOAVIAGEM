package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo ReservaQuarto, onde ser�o contidos, valores e m�todos para o mesmo
 * 
 * @see Classe Reserva com metodo relacionado a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class ReservaQuarto {
	
	private Reserva codigoReserva;
	private int nrQuarto;
	private int qtdePessoaQuarto;
	private String dsObservacao;

	public ReservaQuarto() {
	}

	public ReservaQuarto(Reserva codigoReserva, int nrQuarto,
			int qtdePessoaQuarto, String dsObservacao) {
		super();
		this.codigoReserva = codigoReserva;
		this.nrQuarto = nrQuarto;
		this.qtdePessoaQuarto = qtdePessoaQuarto;
		this.dsObservacao = dsObservacao;
	}

	public Reserva getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(Reserva codigoReserva) {
		this.codigoReserva = codigoReserva;
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
   
}
