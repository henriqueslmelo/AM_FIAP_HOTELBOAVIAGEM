package br.com.fiap.am.teste;

import java.util.List;

import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.dao.TipoQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteListarTipoQuarto {

	public List<TipoQuarto> main(String[] args) throws Excecao {
		TipoQuartoDAO dao = new TipoQuartoDAO();
		List<TipoQuarto> tipoQuarto = dao.getLista();
		try {
			for (TipoQuarto tp : tipoQuarto) {
				System.out.println("Codigo do tipo do quarto: "
						+ tp.getCodigoTipoQuarto());
				System.out.println("Descrição: " + tp.getDescricao());

			}
			return tipoQuarto;

		} catch (Exception e) {
			throw new Excecao("Erro na pesquisa", e);

		}

	}

}
