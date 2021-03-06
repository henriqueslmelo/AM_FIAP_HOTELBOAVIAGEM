package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo Funcionario, onde ser�o contido os metodos do CRUD * 
 * 
 * @see classe funcionario relacionada a essa classe
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

import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class FuncionarioDAO {

	// conexao
	private Connection connection;

	public FuncionarioDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Funcionario> getLista() throws Excecao {
		try {
			List<Funcionario> funcionario = new ArrayList<Funcionario>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_FUNCIONARIO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario func = new Funcionario();
				func.setCodigoFuncionario(rs.getInt("CD_FUNCIONARIO"));
				func.setDtAdmissao(rs.getString("DT_ADIMISSAO"));
				func.setCargo(rs.getString("DS_CARGO"));
				func.setNome(rs.getString("NM_PESSOA"));

			}
			rs.close();
			stmt.close();
			return funcionario;
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
	
	//PESQUISAR
	public boolean Pesquisar(int intID) throws Excecao {
		try{
		Funcionario funcionario = new Funcionario();
		PreparedStatement stmt = this.connection
		.prepareStatement("SELECT CD_FUNCIONARIO FROM T_AM_DFA_FUNCIONARIO WHERE CD_FUNCIONARIO = ?");
		stmt.setInt(1,funcionario.getCodigoFuncionario());
		
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			rs.close();
			stmt.close();
			connection.close();
			return true;
		} else {
			rs.close();
			stmt.close();
			connection.close();
			return false;
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
