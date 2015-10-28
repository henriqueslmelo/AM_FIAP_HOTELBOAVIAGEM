package br.com.fiap.am.bo;

import java.util.List;

import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.dao.ReservaDAO;


public class ReservaBO {
	
	private ReservaDAO rd;
	
	public List<Reserva> listaReserva() throws Exception{
		rd = new ReservaDAO();		
		return rd.getLista(); 
	}
	
	
	public boolean salvarReserva(Reserva r) throws Exception {
			rd = new ReservaDAO ();
			boolean retornoTeste;		
		
			//colocar as regras e negocio utilizando IF e se der certo retorna true se não false
			
			rd.inserir(r);
			retornoTeste = true;
			
		return retornoTeste;
	}
	
	
	public Reserva pesquisaVoluntario(int id) throws Exception{
		rd = new ReservaDAO();
		return rd.getPesquisar(id);
	}
	


}
