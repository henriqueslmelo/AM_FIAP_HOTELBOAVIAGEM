package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo Cliente, onde ser�o contido os metodos do CRUD * 
 * 
 * @see classe cliente relacionada a essa classe
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
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ClienteDAO {

	// conexao
	private static Connection connection;

	public ClienteDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Cliente> getLista() throws Excecao {
		try {
			List<Cliente> cliente = new ArrayList<Cliente>();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM T_AM_DFA_CLIENTE");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Cliente cl = new Cliente();
				cl.setCodigoCliente(rs.getInt("CD_CLIENTE"));
				cl.setCpf(rs.getString("NR_CPF"));
				cl.setRg(rs.getString("NR_RG"));
				cl.setQuartoPreferido(rs.getInt("NR_QUARTO_PREFERIDO"));
				cl.setDsSenha(rs.getString("DS_SENHA"));
				cl.setDtNascimento(rs.getString("DT_NASCIMENTO"));
				cl.setEmail(rs.getString("DS_EMAIL"));
				cl.setNome(rs.getString("NM_PESSOA"));

			}
			rs.close();
			stmt.close();
			return cliente;
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

	// BUSCA USU�RIO
	public boolean getLogin(Cliente cliente) throws Excecao {
		try {

			PreparedStatement stmt = connection
					.prepareStatement("SELECT DS_EMAIL, DS_SENHA FROM T_AM_DFA_CLIENTE WHERE DS_EMAIL=? AND DS_SENHA=?");
			stmt.setString(1, cliente.getEmail());
			stmt.setString(2, cliente.getDsSenha());
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
