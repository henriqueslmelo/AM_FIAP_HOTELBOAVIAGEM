package br.com.fiap.am.teste;

import java.sql.SQLException;

import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.dao.ConsumoDAO;

public class ExcluirConsumo {
	
	public static void main(String[] args) throws SQLException, Exception {
		
		 Consumo consumo = new Consumo();
		 ConsumoDAO dao = new ConsumoDAO();

		 consumo.setCodigoConsumo((int) 1);
		 dao.excluir(consumo);
		 
		 System.out.println("Excluido!");

	}

}
