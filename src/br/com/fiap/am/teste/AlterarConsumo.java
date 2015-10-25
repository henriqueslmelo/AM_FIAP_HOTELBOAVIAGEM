package br.com.fiap.am.teste;

import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.dao.ConsumoDAO;
import br.com.fiap.am.exception.Excecao;

public class AlterarConsumo {

	public static void main(String[] args) throws Excecao{

		 Consumo consumo = new Consumo();
		 ConsumoDAO dao = new ConsumoDAO();

		 consumo.setHospedagem("Codigo Hospedagem: ");
		 consumo.setProduto("Codigo do produto: ");
		 consumo.setServico("Codigo do serviço: ");
		 consumo.setDataConsumo("Data do consumo: ");
		 consumo.setQuantidade("Quantidade: ");
		 
		 dao.alterar(consumo);
		 
		 System.out.println("Alterado!");

	   }

}
