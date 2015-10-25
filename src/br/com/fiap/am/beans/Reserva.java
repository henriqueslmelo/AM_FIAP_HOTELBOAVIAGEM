package br.com.fiap.am.beans;

public class Reserva {
	private int codigoReserva;
	private String dtEntrada;
	private String dtSaida;
	private int qtdeHospedesAdultos;
	private int qtdeHospedesCriancas;
	private ReservaQuarto nrQuarto;
	private Cliente cliente;
	private String situacaoReserva;
	private String dtSolicitação;

	public Reserva() {
		super();
	}

	public Reserva(int codigoReserva, String dtEntrada, String dtSaida, int qtdeHospedesAdultos,
			int qtdeHospedesCriancas, ReservaQuarto nrQuarto, Cliente cliente, String situacaoReserva, String dtSolicitação) {
		super();
		this.codigoReserva = codigoReserva;
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
		this.qtdeHospedesAdultos = qtdeHospedesAdultos;
		this.qtdeHospedesCriancas = qtdeHospedesCriancas;
		this.nrQuarto = nrQuarto;
		this.cliente = cliente;
		this.situacaoReserva = situacaoReserva;
		this.dtSolicitação = dtSolicitação;
	}

	public Reserva(String dtEntrada, String dtSaida, int qtdeHospedesAdultos, int qtdeHospedesCriancas, ReservaQuarto nrQuarto,
			Cliente cliente) {
		super();
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
		this.qtdeHospedesAdultos = qtdeHospedesAdultos;
		this.qtdeHospedesCriancas = qtdeHospedesCriancas;
		this.nrQuarto = nrQuarto;
		this.cliente = cliente;
	}

	public int getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public String getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public String getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(String dtSaida) {
		this.dtSaida = dtSaida;
	}

	public int getQtdeHospedesAdultos() {
		return qtdeHospedesAdultos;
	}

	public void setQtdeHospedesAdultos(int qtdeHospedesAdultos) {
		this.qtdeHospedesAdultos = qtdeHospedesAdultos;
	}

	public int getQtdeHospedesCriancas() {
		return qtdeHospedesCriancas;
	}

	public void setQtdeHospedesCriancas(int qtdeHospedesCriancas) {
		this.qtdeHospedesCriancas = qtdeHospedesCriancas;
	}

	public ReservaQuarto getReservaQuarto() {
		return nrQuarto;
	}

	public void setReservaQuarto(ReservaQuarto nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getSituacaoReserva() {
		return situacaoReserva;
	}

	public void setSituacaoReserva(String situacaoReserva) {
		this.situacaoReserva = situacaoReserva;
	}

	public String getDtSolicitação() {
		return dtSolicitação;
	}

	public void setDtSolicitação(String dtSolicitação) {
		this.dtSolicitação = dtSolicitação;
	}

}
