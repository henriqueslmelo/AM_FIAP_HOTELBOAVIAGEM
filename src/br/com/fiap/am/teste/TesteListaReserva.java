package br.com.fiap.am.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteListaReserva {
	
	public static void main(String[] args) throws Excecao {
	     
		ReservaDAO dao = new ReservaDAO();
		List<Reserva> reserva = dao.getLista();

		for (Reserva reserv : reserva) {
			System.out.println("Codigo da Reserva: " + reserv.getCodigoReserva());
			System.out.println("Data de Entrada: " + reserv.getDtEntrada());
			System.out.println("Data de Saida: " + reserv.getDtSaida());
			System.out.println("Digite a quantidade de hospedes adultos: " + reserv.getQtdeHospedesAdultos());
			System.out.println("Digite a quantidade de hospedes crianças: " + reserv.getQtdeHospedesCriancas());
			System.out.println("Situacao da Reserva: " + reserv.getSituacaoReserva());
			System.out.println("Data da Solicitação: " + reserv.getDtSolicitação());

		}


	}


}
