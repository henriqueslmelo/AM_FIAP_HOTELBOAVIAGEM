package br.com.fiap.am.bo;

import java.util.List;

import br.com.fiap.am.beans.Quarto;
import br.com.fiap.am.dao.QuartoDAO;


public class QuartoBO {
	
	private QuartoDAO quar;
	
	public List<Quarto> listaVoluntario() throws Exception{
		quar = new QuartoDAO();		
		return quar.getLista(); 
	}
	


}
