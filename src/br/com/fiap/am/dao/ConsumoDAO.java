package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ConsumoDAO {

	// conexao
	private Connection connection;

	public ConsumoDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	public void registar(Consumo consumo) throws Exception {
		String sql = "INSERT INTO T_AM_DFAB_CONSUMO"
				+ "(CD_CONSUMO, CD_HOSPEDAGEM, CD_TIPO_SERVICO, CD_FUNCIONARIO, DT_CONSUMO, QT_CONSUMO) values (?,?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		try {
			stmt.setInt(1, consumo.getCodigoConsumo());
			stmt.setInt(2, consumo.getHospedagem());
			stmt.setInt(3, consumo.getProduto());
			stmt.setInt(4, consumo.getServico());
			stmt.setnt(5, consumo.getFuncionario());
			stmt.setString(6, consumo.getDataConsumo());
			stmt.setInt(6, consumo.getQuantidade());


			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro", e);
		} finally {
			stmt.close();
		}
		try {
			connection.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}
	}

	// LISTAR
	public List<Consumo> getLista() throws Excecao {
		try {
			List<Consumo> consumo = new ArrayList<Consumo>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_CONSUMO");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Consumo con = new Consumo();
				con.setCodigoConsumo(rs.getInt("CD_CONSUMO"));
				con.setQuantidade(rs.getInt("QT_CONSUMO"));
				con.setDataConsumo(rs.getString("DT_CONSUMO"));
				
				Hospedagem hosp = new Hospedagem();
				hosp.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));

				Funcionario fun = new Funcionario();
				fun.setCodigoFuncionario(rs.getInt("CD_FUNCIONARIO"));

				consumo.add(con);

			}
			rs.close();
			stmt.close();
			return consumo;
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

	// ALTERAR

	public void alterar(Consumo consumo) throws Excecao {
		String sql = "UPDATE T_AM_DFA_CONSUMO SET CD_HOSPEDAGEM=?, CD_TIPO_SERVICO=?,"
				+ "CD_FUNCIONARIO=?, DT_CONSUMO=?, QT_CONSUMO=? WHERE CD_CONSUMO=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, consumo.getCodigoConsumo());
			stmt.setInt(2, consumo.getHospedagem());
			stmt.setInt(3, consumo.getProduto());
			stmt.setInt(4, consumo.getServico());
			stmt.setnt(5, consumo.getFuncionario());
			stmt.setString(6, consumo.getDataConsumo());
			stmt.setInt(6, consumo.getQuantidade());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}
	}

	// DELETAR
	public void excluir(Consumo consumo) throws Excecao {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM T_AM_DFA_CONSUMO"
							+ "WHERE CD_CONSUMO=?");

			stmt.setInt(1, consumo.getCodigoConsumo());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}

	}

}