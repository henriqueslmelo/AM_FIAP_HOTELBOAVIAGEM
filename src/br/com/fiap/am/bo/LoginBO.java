package br.com.fiap.am.bo;

import java.util.List;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.dao.ClienteDAO;
import br.com.fiap.am.exception.Excecao;


public class LoginBO {
private ClienteDAO  cd;
	
	
	public List<Cliente> getLogin(String user, String password) throws Excecao{
		System.out.println("BO");
		cd = new ClienteDAO();		
		return cd.getLogin(); 
	}
}
