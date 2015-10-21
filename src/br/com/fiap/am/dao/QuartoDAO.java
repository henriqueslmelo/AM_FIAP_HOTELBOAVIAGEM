package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Quarto;
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
					.prepareStatement("SELECT T_AM_DFA_QUARTO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Quarto quar  = new Quarto();
				quar.setCodigoQuarto(rs.getInt("codigoQuarto"));
				quar.setNrQuarto(rs.getInt("nrQuarto"));
				quar.setAndar(rs.getInt("nrQuarto"));
				quar.setCapacidade(rs.getInt("nrQuarto"));


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
