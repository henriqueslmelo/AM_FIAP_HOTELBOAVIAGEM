package br.com.fiap.am.bo;

import java.util.List;

import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.dao.ReservaQuartoDAO;


public class ReservaQuartoBO {

	private ReservaQuartoDAO rq;
	
	public List<ReservaQuarto> listaReservaQuarto() throws Exception{
		rq = new ReservaQuartoDAO();		
		return rq.getLista(); 
	}

	public boolean pesquisaReservaQuarto(int id) throws Exception{
		rq = new ReservaQuartoDAO();
		return rq.pesquisar(id);
	}
	

}
