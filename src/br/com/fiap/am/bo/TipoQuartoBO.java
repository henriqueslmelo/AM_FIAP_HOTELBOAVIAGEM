package br.com.fiap.am.bo;


import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.dao.TipoQuartoDAO;
import br.com.fiap.am.exception.Excecao;

public class TipoQuartoBO {


private TipoQuartoDAO tp;
private TipoQuarto tipoQuarto;
	
	public TipoQuarto consultar(TipoQuarto tipo) throws Excecao{
		return new TipoQuartoDAO().consultar(tipo);
	}

}
