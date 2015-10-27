package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo Endereco, onde serão contido os metodos do CRUD * 
 * 
 * @see classe pessoa relacionada a essa classe
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

import br.com.fiap.am.beans.Endereco;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class EnderecoDAO {

	// conexao
	private Connection connection;

	public EnderecoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Endereco> getLista() throws Excecao {
		try {
			List<Endereco> endereco = new ArrayList<Endereco>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT *  FROM  T_AM_DFA_PESSOA_ENDE");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Endereco end = new Endereco();
				end.setLogradouro(rs.getString("DS_DESCRICAO"));
				end.setTipoLogradouro(rs.getString("DS_TIPO_LOGRADOURO"));
				end.setNumero(rs.getInt("NR_LOGRADOURO"));
				end.setEstado(rs.getString("DS_ESTADO"));
				end.setCidade(rs.getString("NM_CIDADE"));
				end.setBairro(rs.getString("NM_BAIRRO"));
				end.setCep(rs.getInt("NR_CEP"));
				end.setComplemento(rs.getString("DS_COMPLEMENTO"));

			}
			rs.close();
			stmt.close();
			return endereco;
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
