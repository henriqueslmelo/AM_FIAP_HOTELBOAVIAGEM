package br.com.fiap.am.teste;


import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.dao.HospedagemDAO;
import br.com.fiap.am.exception.Excecao;

public class TestePesquisarHospedagem {

	public static void main(String[] args) throws Excecao {

		try {
			HospedagemDAO dao = new HospedagemDAO();
			Hospedagem h = new Hospedagem();
			String pesquisar = JOptionPane
					.showInputDialog("Digite o codigo para pesquisa:");
			h = dao.getPesquisar(pesquisar);
			System.out.println(h.getCodigoReserva());

		} catch (Exception e) {
			throw new Excecao("Codigo de reserva invalido", e);
		}
	}

}
