package br.com.fiap.am.bo;

import br.com.fiap.am.dao.FuncionarioDAO;
import br.com.fiap.am.exception.Excecao;

public class AcessoInternoBO {
	private FuncionarioDAO fun;


 public boolean pesquisaFuncionario(int id) throws Excecao{
			fun = new FuncionarioDAO();
			return fun.Pesquisar(id);

}
		
	}