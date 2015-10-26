package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo Hospedagem, onde serão contidos, valores e métodos para o mesmo
 * 
 * @see Classe Reserva com metodo relacionado a esta classe
 * @see Classe Funcionario com metodo relacionado a esta classe
 * @see Classe Cliente com metodo relacionado a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class Hospedagem {
	private int codigoHospedagem;
	private double desconto;
	private Reserva codigoReserva;
	private Funcionario codigoFuncionario;
	private Cliente codigoCliente;
	private String dataEntrada;
	private String dataSaida;
	private ReservaQuarto nrQuarto;

	

	public Hospedagem() {
		super();
	}

	public Hospedagem(int codigoHospedagem, double desconto,
			Reserva codigoReserva, Funcionario codigoFuncionario,
			Cliente codigoCliente, String dataEntrada,
	String dataSaida, ReservaQuarto nrQuarto) {
		super();
		this.codigoHospedagem = codigoHospedagem;
		this.desconto = desconto;
		this.codigoReserva = codigoReserva;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoCliente = codigoCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.nrQuarto = nrQuarto;

	}

	public Hospedagem(double desconto,
			Reserva codigoReserva, Funcionario codigoFuncionario,
			Cliente codigoCliente, String dataEntrada,
	 String dataSaida, ReservaQuarto nrQuarto) {
		super();
		this.desconto = desconto;
		this.codigoReserva = codigoReserva;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoCliente = codigoCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.nrQuarto = nrQuarto;


	}

	public int getCodigoHospedagem() {
		return codigoHospedagem;
	}

	public void setCodigoHospedagem(int codigoHospedagem) {
		this.codigoHospedagem = codigoHospedagem;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Reserva getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(Reserva codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public Funcionario getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Funcionario codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}


	public Cliente getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Cliente codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public ReservaQuarto getNrQuarto() {
		return nrQuarto;
	}

	public void setNrQuarto(ReservaQuarto nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

}
