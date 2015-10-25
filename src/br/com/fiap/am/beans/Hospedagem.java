package br.com.fiap.am.beans;

public class Hospedagem {
	private int codigoHospedagem;
	private double desconto;
	private Reserva codigoReserva;
	private Funcionario codigoFuncionario;
	private Cliente codigoCliente;

	public Hospedagem() {
		super();
	}

	public Hospedagem(int codigoHospedagem, double desconto,
			Reserva codigoReserva, Funcionario codigoFuncionario,
			Cliente codigoCliente) {
		super();
		this.codigoHospedagem = codigoHospedagem;
		this.desconto = desconto;
		this.codigoReserva = codigoReserva;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoCliente = codigoCliente;

	}

	public Hospedagem(double desconto,
			Reserva codigoReserva, Funcionario codigoFuncionario,
			Cliente codigoCliente) {
		super();
		this.desconto = desconto;
		this.codigoReserva = codigoReserva;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoCliente = codigoCliente;
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

}
