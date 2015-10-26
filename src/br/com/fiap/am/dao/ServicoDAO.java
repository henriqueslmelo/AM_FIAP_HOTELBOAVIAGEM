package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo ServicoDAO, onde serão contido os metodos do CRUD * 
 * 
 * @see classe servico relacionada a essa classe
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

import br.com.fiap.am.beans.Servico;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ServicoDAO {

	// conexao
	private Connection connection;

	public ServicoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Servico> getLista() throws Excecao {
		try {
			List<Servico> servico = new ArrayList<Servico>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_PRODUTO_SERVICO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Servico serv = new Servico();
				serv.setCodigoServico(rs.getInt("CD_TIPO_SERVICO"));
				serv.setDescricaoServico(rs.getString("DS_SERVICO"));
				serv.setNrTipo(rs.getInt("NR_TIPO"));
				
				servico.add(serv);

			}
			rs.close();
			stmt.close();
			return servico;
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
