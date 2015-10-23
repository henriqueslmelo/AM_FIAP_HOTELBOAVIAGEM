package br.com.fiap.am.teste;

import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.dao.ReservaQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteListaReserva {

	public static void main(String[] args) throws Excecao {

		ReservaDAO dao = new ReservaDAO();
		List<Reserva> reserva = dao.getLista();
		ReservaQuartoDAO dao2 = new ReservaQuartoDAO();
		List<ReservaQuarto> reservaQuarto = dao2.getLista();

		for (Reserva reserv : reserva) {
			for (ReservaQuarto rq : reservaQuarto) {

			System.out.println("Codigo da Reserva: "
					+ reserv.getCodigoReserva());
			System.out.println("Data de Entrada: " + reserv.getDtEntrada());
			System.out.println("Data de Saida: " + reserv.getDtSaida());
			System.out.println("Quantidade de hospedes adultos: "
					+ reserv.getQtdeHospedesAdultos());
			System.out.println("Quantidade de hospedes crianças: "
					+ reserv.getQtdeHospedesCriancas());
			System.out.println("Situacao da Reserva: "
					+ reserv.getSituacaoReserva());
			System.out.println("Data da Solicitação: "
					+ reserv.getDtSolicitação());
			System.out.println("Numero do quarto: "
					+ rq.getNrQuarto() +"\n");


		}

	}

}
}
