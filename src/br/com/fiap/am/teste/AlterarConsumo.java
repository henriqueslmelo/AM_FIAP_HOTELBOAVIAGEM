package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.beans.Produto;
import br.com.fiap.am.beans.Servico;
import br.com.fiap.am.dao.ConsumoDAO;
import br.com.fiap.am.exception.Excecao;

public class AlterarConsumo {

	public static void main(String[] args) throws Excecao {

		try{
		Consumo consumo = new Consumo();
		ConsumoDAO dao = new ConsumoDAO();

		Hospedagem hospedagem = new Hospedagem();
		hospedagem.setCodigoHospedagem(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código da hospedagem: ")));
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigoFuncionario(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código do funcionário: ")));

		Produto produto = new Produto();
		produto.setCodigoProduto(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código da hospedagem: ")));

		Servico servico = new Servico();
		servico.setCodigoServico(Integer.parseInt(JOptionPane
				.showInputDialog("Digite o código da hospedagem: ")));

		consumo.setDataConsumo(JOptionPane.showInputDialog("Data do consumo: "));
		consumo.setQuantidade(Integer.parseInt(JOptionPane
				.showInputDialog("Quantidade: ")));

		consumo.setHospedagem(hospedagem);
		consumo.setProduto(produto);
		consumo.setServico(servico);

		dao.alterar(consumo);
		System.out.println("Alterado!");

	}catch (Exception e){
		throw new Excecao ("Erro", e);
	}
	}
}
