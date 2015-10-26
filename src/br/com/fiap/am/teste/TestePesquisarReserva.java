package br.com.fiap.am.teste;


import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TestePesquisarReserva {

	public static void main(String[] args) throws Excecao {

		try {
			ReservaDAO dao = new ReservaDAO();
			Reserva r = new Reserva();
			String pesquisar = JOptionPane
					.showInputDialog("Digite o codigo para pesquisa:");
			r = dao.getPesquisar(pesquisar);
			System.out.println(r.getCodigoReserva());

		} catch (Exception e) {
			throw new Excecao("Codigo de reserva invalido", e);
		}

	}

}
