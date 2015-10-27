package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo TipoQuarto, onde serão contido os metodos do CRUD * 
 * 
 * @see classe tipoQuarto relacionada a essa classe
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
					.prepareStatement("SELECT * FROM T_AM_DFA_TIPO_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				TipoQuarto tp = new TipoQuarto();
				tp.setCodigoTipoQuarto(rs.getInt("CD_TIPO_QUARTO"));
				tp.setDescricao(rs.getString("DS_TIPO_QUARTO"));
				tp.setDescricao(rs.getString("DS_OBSERVACAO"));

				

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
