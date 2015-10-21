package br.com.fiap.am.teste;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteAlterarReserva {
	
	public static void main(String[] args) throws Excecao{

	 Reserva reserva = new Reserva();
	 ReservaDAO dao = new ReservaDAO();

	 reserva.setSituacaoReserva("Novo Status");
	 reserva.setDtSolicitação("dtSolicitação");
	 
	 dao.alterar(reserva);
	 
	 System.out.println("Alterado!");

   }

}
