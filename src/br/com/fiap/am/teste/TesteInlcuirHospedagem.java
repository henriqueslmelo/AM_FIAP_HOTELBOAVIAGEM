package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.dao.HospedagemDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteInlcuirHospedagem {

	public static void main(String[] args) throws Excecao {

		Hospedagem hospedagem = new Hospedagem();
		hospedagem.setDataEntrada(JOptionPane
				.showInputDialog("Digite a data de entrada: "));
		hospedagem.setDataSaida(JOptionPane
				.showInputDialog("Digite a data de saida: "));
		hospedagem.setDesconto(Double.parseDouble(JOptionPane
				.showInputDialog("Digite o percentual de desconto:")));

		Funcionario fun = new Funcionario();
		fun.setCodigoFuncionario(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código do funcionário: ")));
		
		Cliente cl = new Cliente();
		cl.setCodigoCliente(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código do cliente: ")));


		Reserva res = new Reserva();
		res.setCodigoReserva(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código da reserva: ")));
		

		 ReservaQuarto rq = new ReservaQuarto();
		 rq.setNrQuarto(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto: ")));;

        hospedagem.setCodigoFuncionario(fun);
        hospedagem.setCodigoCliente(cl);
        hospedagem.setCodigoReserva(res);
        hospedagem.setNrQuarto(rq);


		HospedagemDAO dao = new HospedagemDAO();
		try {
			dao.registrar(hospedagem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Gravado!");

	}

}
