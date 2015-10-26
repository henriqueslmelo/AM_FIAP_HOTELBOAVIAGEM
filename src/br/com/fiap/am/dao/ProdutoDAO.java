package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo ProdutoDAO, onde serão contido os metodos do CRUD * 
 * 
 * @see classe produto relacionada a essa classe
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

import br.com.fiap.am.beans.Produto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ProdutoDAO {

	// conexao
	private Connection connection;

	public ProdutoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Produto> getLista() throws Excecao {
		try {
			List<Produto> produto = new ArrayList<Produto>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_PRODUTO_SERVICO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produto pro = new Produto();
				pro.setCodigoProduto(rs.getInt("CD_TIPO_SERVICO"));
				pro.setDescricaoProduto(rs.getString("DS_SERVICO"));
				pro.setNrTipo(rs.getInt("NR_TIPO"));

				produto.add(pro);

			}
			rs.close();
			stmt.close();
			return produto;
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
