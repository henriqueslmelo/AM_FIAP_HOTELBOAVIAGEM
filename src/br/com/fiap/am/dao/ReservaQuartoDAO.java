package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo ReservaQuartoDAO, onde serão contido os metodos do CRUD * 
 * 
 * @see classe Reserva relacionada a essa classe
 * @see classe ReservaQuarto relacionada a essa classe
 * @see classe conexao relacionada a esta classes
 * @see classe excecao relacionada a esta classe
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ReservaQuartoDAO {

	// conexao
	private Connection connection;

	public ReservaQuartoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	public List<ReservaQuarto> getLista() throws Excecao {
		try {
			List<ReservaQuarto> reservaQuarto = new ArrayList<ReservaQuarto>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM  T_AM_DFA_RESERVA_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ReservaQuarto rq = new ReservaQuarto();
				rq.setNrQuarto(rs.getInt("NR_QUARTO"));
				rq.setQtdePessoaQuarto(rs.getInt("QT_PESSOA_QUARTO"));
				rq.setDsObservacao(rs.getString("DS_OBSERVACAO"));
				rq.setCodigoReserva(new Reserva());
				rq.getCodigoReserva().setCodigoReserva(rs.getInt("CD_RESERVA"));

				reservaQuarto.add(rq);

			}
			rs.close();
			stmt.close();
			return reservaQuarto;
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				throw new Excecao("Ocorreu um erro", e);
			}
		}

	}

}
