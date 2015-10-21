package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class TipoQuartoDAO {
	
	// conexao
	private Connection connection;

	public TipoQuartoDAO() throws Excecao{
		this.connection = new Conexao().getConnection();
	}


	// LISTAR
	public List<TipoQuarto> getLista() throws Excecao {
		try {
			List<TipoQuarto> tipoQuarto = new ArrayList<TipoQuarto>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT T_AM_DFA_TIPO_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				TipoQuarto tp = new TipoQuarto();
				tp.setCodigoTipoQuarto(rs.getInt("codigoTipoQuarto"));
				tp.setDescricao(rs.getString("dtEntrada"));

			}
			rs.close();
			stmt.close();
			return tipoQuarto;
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


}
