package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ReservaDAO {

	// conexao
	private Connection connection;

	public ReservaDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	// LISTAR
	public List<Reserva> getLista() throws Excecao {
		try {
			List<Reserva> reserva = new ArrayList<Reserva>();
			PreparedStatement stmt = connection.prepareStatement("SELECT T_AM_DFA_RESERVA");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Reserva reserv = new Reserva();
				reserv.setCodigoReserva(rs.getInt("codigoReserva"));
				reserv.setDtEntrada(rs.getString("dtEntrada"));
				reserv.setDtSaida(rs.getString("dtSaida"));
				reserv.setQtdeHospedesAdultos(rs.getInt("qtdeHospedesAdultos"));
				reserv.setQtdeHospedesCriancas(rs.getInt("qtdeHospedesCriancas"));
				reserv.setSituacaoReserva(rs.getString("situacaoReserva"));
				reserv.setDtSolicitação(rs.getString("dtSolicitação"));

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
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM T_AM_DFA_RESERVA" + "WHERE CD_RESERVA=?");

			stmt.setInt(1, reserva.getCodigoReserva());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}
	}

}



