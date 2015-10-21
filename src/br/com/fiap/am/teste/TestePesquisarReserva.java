package br.com.fiap.am.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TestePesquisarReserva {

	public static void main(String[] args) throws Excecao {

		try {
			ReservaDAO dao = new ReservaDAO();
			List<Reserva> lista = dao.getLista();
			for (Reserva obj : lista) {
				System.out.println(obj.getDtEntrada() + "\n" + obj.getDtSaida()
						+ "\n" + obj.getDtSolicitação() + "\n"
						+ obj.getQtdeHospedesAdultos() + "\n" + obj.getQtdeHospedesCriancas()
						+ "\n" + obj.getSituacaoReserva());

			}
		} catch (Exception e) {
			throw new Excecao("Codigo de reserva invalido", e);
		}

	}

}
