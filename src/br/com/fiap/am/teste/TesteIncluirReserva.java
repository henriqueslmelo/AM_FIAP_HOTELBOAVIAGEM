package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteIncluirReserva {

	public static void main(String[] args) throws Excecao {
		try {
			Reserva reserva = new Reserva();
			reserva.setDtSolicita��o(JOptionPane
					.showInputDialog("Digite a data de solicita��o:"));
			reserva.setDtEntrada(JOptionPane
					.showInputDialog("Digite a data de enntrada: "));
			reserva.setDtSaida(JOptionPane
					.showInputDialog("Digite a data de saida"));
			reserva.setQtdeHospedesAdultos(Integer.parseInt(JOptionPane
					.showInputDialog("Digite a quantidade de hospedes adultos: ")));
			reserva.setQtdeHospedesCriancas(Integer.parseInt(JOptionPane
					.showInputDialog("Digite a quantidade de hospedes crina�as")));

			Cliente cl = new Cliente();
			cl.setCodigoCliente(Integer.parseInt(JOptionPane
					.showInputDialog("Digite o c�digo do cliente")));

			ReservaQuarto rq = new ReservaQuarto();
			rq.setNrQuarto(Integer.parseInt(JOptionPane
					.showInputDialog("Digite o n�mero do quarto")));

			reserva.setCliente(cl);
			reserva.setReservaQuarto(rq);

			ReservaDAO dao = new ReservaDAO();
			dao.inserir(reserva);
			System.out.println("Gravado!");

		} catch (Exception e) {
			throw new Excecao("Falha", e);
		}

	}

}
