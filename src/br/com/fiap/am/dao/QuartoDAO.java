package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo QuartoDAO, onde serão contido os metodos do CRUD * 
 * 
 * @see classe quarto relacionada a essa classe
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

import br.com.fiap.am.beans.Quarto;
import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class QuartoDAO {
	
	// conexao
	private Connection connection;

	public QuartoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}


	// LISTAR
	public List<Quarto> getLista() throws Excecao {
		try {
			List<Quarto> quarto = new ArrayList<Quarto>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Quarto quar  = new Quarto();
				quar.setNrQuarto(rs.getInt("NR_QUARTO"));
				quar.setAndar(rs.getInt("NR_ANDAR"));
				quar.setCapacidade(rs.getInt("NR_CAPACIDADE"));
				quar.setTipoQuarto(new TipoQuarto());
				quar.getTipoQuarto().setCodigoTipoQuarto(rs.getInt("CD_TIPO_QUARTO"));
		
				quarto.add(quar);



			}
			rs.close();
			stmt.close();
			return quarto;
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro" , e);
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				throw new Excecao("Ocorreu um erro", e);
			}
		}

	}
}
