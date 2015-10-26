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

public class HospedagemDAO {

	// conexao
	private Connection connection;

	public HospedagemDAO() throws Excecao {
		this.connection = new Conexao().getConnection();
	}

	public void registrar(Hospedagem hospedagem) throws Exception {
		String sql = "INSERT INTO T_AM_DFAB_HOSPEDAGEM"
				+ "(NR_QUARTO, CD_RESERVA, CD_CLIENTE, CD_FUNCIONARIO, DT_ENTRADA, DT_SAIDA, VC_PERC_DESCONTO) values (?,?,?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		try {
			stmt.setString(1, hospedagem.getDataEntrada());
			stmt.setString(2, hospedagem.getDataSaida());
			stmt.setDouble(3, hospedagem.getDesconto());

			Reserva res = new Reserva();
			stmt.setInt(4, res.getCodigoReserva());

			ReservaQuarto quar = new ReservaQuarto();
			stmt.setInt(5, quar.getNrQuarto());

			Cliente cl = new Cliente();
			stmt.setInt(6, cl.getCodigoCliente());

			Funcionario fun = new Funcionario();
			stmt.setInt(7, fun.getCodigoFuncionario());

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
	public List<Hospedagem> getLista() throws Excecao {
		try {
			List<Hospedagem> hospedagem = new ArrayList<Hospedagem>();
			PreparedStatement stmt = connection
					.prepareStatement("SELECT FROM T_AM_DFA_HOSPEDAGEM A INNER JOIN T_AM_RESERVA B ON (A.CD_RESERVA = B.CD_RESRVA)");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Hospedagem hosp = new Hospedagem();
				hosp.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));
				hosp.setDesconto(rs.getDouble("VC_PERC_DESCONTO"));
				hosp.setCodigoCliente(new Cliente());
				hosp.getCodigoCliente().setCodigoCliente(
						rs.getInt("CD_CLIENTE"));
				hosp.setNrQuarto(new ReservaQuarto());
				hosp.getNrQuarto().setNrQuarto(rs.getInt("NR_QUARTO"));
				hosp.setCodigoReserva(new Reserva());
				hosp.getCodigoReserva().setCodigoReserva(
						rs.getInt("CD_RESERVA"));
				hosp.setCodigoFuncionario(new Funcionario());
				hosp.getCodigoFuncionario().setCodigoFuncionario(
						rs.getInt("CD_FUNCIONARIO"));

				hospedagem.add(hosp);

			}
			rs.close();
			stmt.close();
			return hospedagem;
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

	// PESQUISAR

	public Hospedagem getPesquisar(String Codigo) throws Exception {
		Hospedagem hospedagem = new Hospedagem();
		PreparedStatement stmt = this.connection
				.prepareStatement("SELECT FROM T_AM_DFA_HOSPEDAGEM WHERE CD_HOSPEDAGEM = ?");
		stmt.setString(1, Codigo);
		ResultSet rs = stmt.executeQuery();
		try {
			if (rs.next()) {
				hospedagem.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));
				hospedagem.setDesconto(rs.getDouble("VC_PERC_DESCONTO"));
				hospedagem.setCodigoCliente(new Cliente());
				hospedagem.getCodigoCliente().setCodigoCliente(
						rs.getInt("CD_CLIENTE"));
				hospedagem.setNrQuarto(new ReservaQuarto());
				hospedagem.getNrQuarto().setNrQuarto(rs.getInt("NR_QUARTO"));
				hospedagem.setCodigoReserva(new Reserva());
				hospedagem.getCodigoReserva().setCodigoReserva(
						rs.getInt("CD_RESERVA"));
				hospedagem.setCodigoFuncionario(new Funcionario());
				hospedagem.getCodigoFuncionario().setCodigoFuncionario(
						rs.getInt("CD_FUNCIONARIO"));

			}
			rs.close();
			stmt.close();
			return hospedagem;
		} catch (Exception e) {
			throw new Exception("Codigo Incorreto");
		}
	}

}
