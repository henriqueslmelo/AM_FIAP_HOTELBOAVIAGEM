package br.com.fiap.am.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.dao.TipoQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteListarTipoQuarto {

	public List<TipoQuarto> main(String[] args) throws Excecao {
		TipoQuartoDAO dao = new TipoQuartoDAO();
		List<TipoQuarto> tipoQuarto = dao.getLista();
     
		for (TipoQuarto tp : tipoQuarto) {
			System.out.println("Codigo do tipo do quarto: " + tp.getCodigoTipoQuarto());
			System.out.println("Descrição: " + tp.getDescricao());

		}

       return tipoQuarto;
	  }


	}


