package br.com.fiap.am.bo;

import java.util.List;

import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.dao.TipoQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class TipoQuartoBO {


private TipoQuartoDAO tp;
	
	public TipoQuarto listaVl() throws Excecao{
		tp = new TipoQuartoDAO();		
		return tp.Pesquisar("FABIOBAITOL"); 
	}

}
