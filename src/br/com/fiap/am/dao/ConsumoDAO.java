package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ConsumoDAO {

	// conexao
	private Connection connection;

	public ReservaDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	public void inserir(Reserva reserva) throws Exception {
		String sql = "INSERT INTO T_AM_DFAB_RESERVA"
				+ "(DT_ENTRADA, DT_SAIDA, QT_ADULTO, QT_CRIANCA,ST_RESERVA) values (?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		try {
			stmt.setString(1, reserva.getDtEntrada());
			stmt.setString(2, reserva.getDtSaida());
			stmt.setInt(3, reserva.getQtdeHospedesAdultos());
			stmt.setInt(4, reserva.getQtdeHospedesCriancas());
			stmt.setString(5, reserva.getSituacaoReserva());
			
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
	public List<Reserva> getLista() throws Excecao {
		try {
			List<Reserva> reserva = new ArrayList<Reserva>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM T_AM_DFA_RESERVA A INNER JOIN T_AM_DFA_RESERVA_QUARTO B ON (A.CD_RESERVA = B.CD_RESERVA)");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Reserva reserv = new Reserva();
				reserv.setCodigoReserva(rs.getInt("CD_RESERVA"));
				reserv.setDtEntrada(rs.getString("DT_INICIO_RESERVA"));
				reserv.setDtSaida(rs.getString("DT_FINAL_RESERVA"));
				reserv.setQtdeHospedesAdultos(rs.getInt("QT_ADULTO"));
				reserv.setQtdeHospedesCriancas(rs.getInt("QT_CRIANCA"));
				reserv.setSituacaoReserva(rs.getString("ST_RESERVA"));
				reserv.setDtSolicitação(rs.getString("DT_SOLICITACAO"));

				ReservaQuarto quar = new ReservaQuarto();
				quar.setNrQuarto(rs.getInt("NR_QUARTO"));
				
				Cliente cl = new Cliente();
				cl.setCodigoCliente(rs.getInt("CD_CLIENTE"));
				cl.setNome(rs.getString("NM_PESSOA"));

				reserva.add(reserv);

			}
			rs.close();
			stmt.close();
			return reserva;
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

	public void alterar(Reserva reserva) throws Excecao {
		String sql = "UPDATE T_AM_DFA_RESERVA SET DT_INICIO_RESERVA=?, DT_FINAL_RESERVA=?,"
				+ "QT_ADULTO=?, QT_CRIANCA=?, ST_RESERVA=? WHERE CD_RESERVA=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, reserva.getDtEntrada());
			stmt.setString(2, reserva.getDtSaida());
			stmt.setInt(3, reserva.getQtdeHospedesAdultos());
			stmt.setInt(4, reserva.getQtdeHospedesCriancas());
			stmt.setString(5, reserva.getDtSolicitação());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}
	}

	// DELETAR
	public void excluir(Reserva reserva) throws Excecao {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM T_AM_DFA_RESERVA"
							+ "WHERE CD_RESERVA=?");

			stmt.setInt(1, reserva.getCodigoReserva());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}

	}

}
