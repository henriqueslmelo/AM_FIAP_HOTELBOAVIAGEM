package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.dao.TipoQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class PesquisarTipoQuarto {

	public static void main(String[] args) throws Excecao {

		try {
			TipoQuartoDAO dao = new TipoQuartoDAO();
			TipoQuarto tp = new TipoQuarto();
			String pesquisar = (JOptionPane
					.showInputDialog("Digite o nome do quarto para pesquisa:"));
		    tp = dao.consultar(tp);
			System.out.println(tp.getDescricao());
			System.out.println(tp.getVlQuarto());


		} catch (Exception e) {
			throw new Excecao("Codigo de reserva invalido", e);
		}

	}

}
