package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo Telefone, onde serão contido os metodos do CRUD * 
 * 
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

import br.com.fiap.am.beans.Telefone;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class TelefoneDAO {

	// conexao
	private Connection connection;

	public TelefoneDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Telefone> getLista() throws Excecao {
		try {
			List<Telefone> telefone = new ArrayList<Telefone>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_TELEFONE");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Telefone tel = new Telefone();
				tel.setNumero(rs.getInt("NR_TELEFONE"));
				tel.setDdd(rs.getInt("NR_DDD"));
				tel.setTipoTelefone(rs.getString("DS_TIPO_TELEFONE"));

			}
			rs.close();
			stmt.close();
			return telefone;
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
