package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ReservaQuartoDAO {
	
	// conexao
	private Connection connection;

	public ReservaQuartoDAO() throws Excecao{
		this.connection = new Conexao().getConnection();
	}


	// LISTAR
	public List<ReservaQuarto> getLista() throws Excecao {
		try {
			List<ReservaQuarto> reservaQuarto = new ArrayList<ReservaQuarto>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_RESERVA_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ReservaQuarto rq= new ReservaQuarto();
				rq.setCodigoReservaQuarto(rs.getInt("CD_RESERVA_QUARTO"));
				rq.setNrQuarto(rs.getInt("NM_QUARTO"));
				rq.setQtdePessoaQuarto(rs.getInt("QT_PESSOA_QUARTO"));
				rq.setDsObservacao(rs.getString("DS_OBSERVACAO"));
				rq.setTipoQuarto(new TipoQuarto());
				rq.getTipoQuarto().setCodigoTipoQuarto(rs.getInt("CD_TIPO_QUARTO"));;

			}
			rs.close();
			stmt.close();
			return reservaQuarto;
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro" , e);
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				throw new Excecao("Ocorreu um erro" , e);
			}
		}

	}

	
	public boolean pesquisar(int codigo) throws Excecao {
		try {
			
			ReservaQuarto reque = new ReservaQuarto();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_TIPO_RESERVA_QUARTO WHERE CD_RESERVA_QUARTO = ?");
			stmt.setInt(1, reque.getCodigoReservaQuarto());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				rs.close();
				stmt.close();
				connection.close();
				return true;
			} else {
				rs.close();
				stmt.close();
				connection.close();
				return false;
			}
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
	
	




