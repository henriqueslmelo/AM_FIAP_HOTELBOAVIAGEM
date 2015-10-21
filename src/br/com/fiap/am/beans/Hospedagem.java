package br.com.fiap.am.beans;

public class Hospedagem {
	private int codigoHospedagem;
	private double desconto;
	private Reserva reserva;
	private Funcionario funcionario;

	public Hospedagem() {
		super();
	}

	public Hospedagem(int codigoHospedagem, double desconto, Reserva reserva, Funcionario funcionario) {
		super();
		this.codigoHospedagem = codigoHospedagem;
		this.desconto = desconto;
		this.reserva = reserva;
		this.funcionario = funcionario;
	}

	public Hospedagem(double desconto, Reserva reserva, Funcionario funcionario) {
		super();
		this.desconto = desconto;
		this.reserva = reserva;
		this.funcionario = funcionario;
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

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
