package br.com.fiap.am.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class ReservaDAO {

	// conexao
	private Connection connection;

	public ReservaDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	public void inserir(Reserva reserva) throws Exception {
		String sql = "INSERT INTO T_AM_DFAB_RESERVA"
				+ "(DT_SOLICITACAO,DT_ENTRADA, DT_SAIDA, QT_ADULTO, QT_CRIANCA,ST_RESERVA, NR_QUARTO, CD_CLIENTE, CD_FUNCIONARIO) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		try {
			stmt.setString(1, reserva.getDtSolicitação());
			stmt.setString(2, reserva.getDtEntrada());
			stmt.setString(3, reserva.getDtSaida());
			stmt.setInt(4, reserva.getQtdeHospedesAdultos());
			stmt.setInt(5, reserva.getQtdeHospedesCriancas());
			stmt.setString(6, reserva.getSituacaoReserva());

			ReservaQuarto quar = new ReservaQuarto();
			stmt.setInt(7, quar.getNrQuarto());

			Cliente cl = new Cliente();
			stmt.setInt(8, cl.getCodigoCliente());

			Funcionario fun = new Funcionario();
			stmt.setInt(9, fun.getCodigoFuncionario());

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
				reserv.setCliente(new Cliente());
				reserv.getCliente().setCodigoCliente(rs.getInt("CD_CLIENTE"));
				reserv.setReservaQuarto(new ReservaQuarto());
				reserv.getReservaQuarto().setNrQuarto(rs.getInt("NR_QUARTO"));

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

	public Reserva getPesquisar(String Codigo) throws Exception {
		Reserva reserva = new Reserva();
		PreparedStatement stmt = this.connection
				.prepareStatement("SELECT FROM T_AM_DFA_RESERVA WHERE CD_RESERVA = ?");
		stmt.setString(1, Codigo);
		ResultSet rs = stmt.executeQuery();
		try {
			if (rs.next()) {
				reserva.setCodigoReserva(rs.getInt("CD_RESERVA"));
				reserva.setDtEntrada(rs.getString("DT_INICIO_RESERVA"));
				reserva.setDtSaida(rs.getString("DT_FINAL_RESERVA"));
				reserva.setQtdeHospedesAdultos(rs.getInt("QT_ADULTO"));
				reserva.setQtdeHospedesCriancas(rs.getInt("QT_CRIANCA"));
				reserva.setSituacaoReserva(rs.getString("ST_RESERVA"));
				reserva.setDtSolicitação(rs.getString("DT_SOLICITACAO"));
				reserva.setCliente(new Cliente());
				reserva.getCliente().setCodigoCliente(rs.getInt("CD_CLIENTE"));
				reserva.setReservaQuarto(new ReservaQuarto());
				reserva.getReservaQuarto().setNrQuarto(rs.getInt("NR_QUARTO"));



			}
			rs.close();
			stmt.close();
			return reserva;
		} catch (Exception e) {
			throw new Exception("Codigo Incorreto");
		}
	}

}
