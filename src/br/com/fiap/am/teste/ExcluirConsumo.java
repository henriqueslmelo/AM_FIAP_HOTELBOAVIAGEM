package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.dao.ConsumoDAO;
import br.com.fiap.am.exception.Excecao;

public class ExcluirConsumo {

	public static void main(String[] args) throws Excecao {
		try {
			Consumo consumo = new Consumo();
			ConsumoDAO dao = new ConsumoDAO();

			consumo.setCodigoConsumo(Integer.parseInt(JOptionPane
					.showInputDialog("Digite o código do consumo para excluir: ")));

			dao.Excluir(consumo);
			System.out.println("Excluido!");

		} catch (Exception e) {
			throw new Excecao("Falha", e);
		}
	}
}
