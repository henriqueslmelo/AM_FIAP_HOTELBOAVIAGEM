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

import br.com.fiap.am.beans.Cliente;
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

	
	public TipoQuarto Pesquisar(String srtipoQuarto) throws Excecao {
		TipoQuarto tipoQuarto = new TipoQuarto();
		System.out.println("DAO");
		try {

			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_TIPO_QUARTO WHERE DS_TIPO_QUARTO=?");
			stmt.setString(1, srtipoQuarto);
			ResultSet rs = stmt.executeQuery();
			System.out.println("DAO QUERY");
			if (rs.next()) {
				tipoQuarto.setVlQuarto(rs.getDouble("VL_TIPO_QUARTO"));
				rs.close();
				stmt.close();
				connection.close();
				System.out.println("DAOTREU");
				return tipoQuarto;
				
			} else {
				rs.close();
				stmt.close();
				connection.close();
				System.out.println("FALSE");
				return tipoQuarto;
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
