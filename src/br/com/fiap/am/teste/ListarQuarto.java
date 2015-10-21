package br.com.fiap.am.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.am.beans.Quarto;
import br.com.fiap.am.dao.QuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class ListarQuarto {
	
	public class TesteListarTipoQuarto {

		public List<Quarto> main(String[] args) throws Excecao {
			QuartoDAO dao = new QuartoDAO();
			List<Quarto> quarto = dao.getLista();
	     
			for (Quarto quar : quarto) {
				System.out.println("Codigo do quarto: " + quar.getCodigoQuarto());
				System.out.println("Numero do Quarto: " + quar.getNrQuarto());
				System.out.println("Capacidade: " + quar.getCapacidade());
				System.out.println("Andar: " + quar.getAndar());

			}

	       return quarto;
		  }

	}
}
