package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo Pessoa, onde serão contido os metodos do CRUD * 
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

import br.com.fiap.am.beans.Pessoa;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class PessoaDAO {

	private Connection connection;

	public PessoaDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Pessoa> getLista() throws Excecao {
		try {
			List<Pessoa> pessoa = new ArrayList<Pessoa>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT FROM * T_AM_DFA_CLIENTE");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa pe = new Pessoa();
				pe.setCodigoPessoa(rs.getInt("CD_PESSOA"));
				pe.setNome(rs.getString("NM_PESSOA"));
			}
			rs.close();
			stmt.close();
			return pessoa;
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
