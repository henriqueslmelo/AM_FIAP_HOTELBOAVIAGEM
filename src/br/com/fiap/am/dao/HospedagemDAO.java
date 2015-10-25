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
import br.com.fiap.tageando.beans.BeneficiarioBeans;

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
			stmt.setInt(1, hospedagem.getNrQuarto());
			stmt.setString(2, hospedagem.getDataEntrada());
			stmt.setString(3, hospedagem.getDataSaida());
			stmt.setDouble(4, hospedagem.getDesconto());

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
					.prepareStatement("SELECT * FROM T_AM_DFA_HOSPEDAGEM)");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Hospedagem hosp = new Hospedagem();
				hosp.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));
				hosp.setDesconto(rs.getDouble("VC_PERC_DESCONTO"));

				Reserva res = new Reserva();
				res.setCodigoReserva(rs.getInt("CD_RESERVA"));
				
				ReservaQuarto rq = new ReservaQuarto();
				rq.setNrQuarto(rs.getInt("NR_QUARTO"));

				
				Cliente cl = new Cliente();
				cl.setCodigoCliente(rs.getInt("CD_CLIENTE"));

				Funcionario fun = new Funcionario();
				fun.setCodigoFuncionario(rs.getInt("CD_FUNCIONARIO"));

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
		
		//PESQUISAR
		
		public Hospedagem Pesquisar(int Codigo) throws Exception {
			Hospedagem hospedagem = new Hospedagem();
			PreparedStatement stmt = this.connection
					.prepareStatement("SELECT * T_AM_DFA_HOSPEDAGEM WHERE CD_HOSPEDAGEM = ?");
			stmt.setInt(1, Codigo);
			ResultSet rs= stmt.executeQuery();
	        try{
			if (rs.next()) {
				hospedagem.setCodigoHospedagem(rs.getInt("CD_HOSPEDAGEM"));
				hospedagem.setDesconto(rs.getDouble("VC_PERC_DESCONTO"));

				Reserva res = new Reserva();
				res.setCodigoReserva(rs.getInt("CD_RESERVA"));
				
				ReservaQuarto rq = new ReservaQuarto();
				rq.setNrQuarto(rs.getInt("NR_QUARTO"));

				
				Cliente cl = new Cliente();
				cl.setCodigoCliente(rs.getInt("CD_CLIENTE"));

				Funcionario fun = new Funcionario();
				fun.setCodigoFuncionario(rs.getInt("CD_FUNCIONARIO"));

		}
			rs.close();
			stmt.close();
			return hospedagem;
		} catch (Exception e) {
			throw new Exception("Codigo Incorreto");
		}
	 }

	}

