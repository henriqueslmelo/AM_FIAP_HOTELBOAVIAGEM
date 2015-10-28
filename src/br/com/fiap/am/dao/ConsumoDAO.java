package br.com.fiap.am.dao;

/**
 * Classe para acesso ao banco de dados do tipo ConsumoDAO, onde serão contido os metodos do CRUD * 
 * 
 * @see classe Hospedagem relacionada a essa classe
 * @see classe Consumo relacionada a essa classe
 * @see classe Produto relacionada a essa classe
 * @see classe Servico relacionada a essa classe
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

import br.com.fiap.am.beans.Consumo;
import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.beans.Produto;
import br.com.fiap.am.beans.Servico;
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
			stmt.setString(2, consumo.getDataConsumo());
			stmt.setInt(3, consumo.getQuantidade());

			Hospedagem hosp = new Hospedagem();
			stmt.setInt(4, hosp.getCodigoHospedagem());

			Funcionario fun = new Funcionario();
			stmt.setInt(5, fun.getCodigoFuncionario());

			Produto pro = new Produto();
			stmt.setInt(6, pro.getCodigoProduto());

			Servico serv = new Servico();
			stmt.setInt(7, serv.getCodigoServico());

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
					.prepareStatement("SELECT * FROM T_AM_DFA_CONSUMO A INNER JOIN T_AM_DFA_HOSPEDAGEM B (A.CD_HOSPEDAGEM = B.CD_HOSPEDAGEM )");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Consumo con = new Consumo();
				con.setCodigoConsumo(rs.getInt("CD_CONSUMO"));
				con.setQuantidade(rs.getInt("QT_CONSUMO"));
				con.setDataConsumo(rs.getString("DT_CONSUMO"));
				con.setHospedagem(new Hospedagem());
				con.getHospedagem().setCodigoHospedagem(
						rs.getInt("CD_HOSPEDAGEM"));
				con.setFuncionario(new Funcionario());
				con.getFuncionario().setCodigoFuncionario(
						rs.getInt("CD_FUNCIONARIO"));

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
			stmt.setString(2, consumo.getDataConsumo());
			stmt.setInt(3, consumo.getQuantidade());

			Hospedagem hosp = new Hospedagem();
			stmt.setInt(4, hosp.getCodigoHospedagem());

			Funcionario fun = new Funcionario();
			stmt.setInt(5, fun.getCodigoFuncionario());

			Produto pro = new Produto();
			stmt.setInt(6, pro.getCodigoProduto());

			Servico serv = new Servico();
			stmt.setInt(7, serv.getCodigoServico());

			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}
	}

	// DELETAR
	public int Excluir(Consumo consumo) throws Excecao {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM T_AM_DFA_CONSUMO WHERE CD_CONSUMO=?");

			stmt.setInt(1, consumo.getCodigoConsumo());
			int saida = stmt.executeUpdate();
			stmt.close();
			return saida;

		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}

	}

}
