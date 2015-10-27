package br.com.fiap.am.conexao;

/**
 * Classe para conexão com o banco de dados Oracle
 * 
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


import java.sql.Connection;
import java.sql.DriverManager;

import br.com.fiap.am.exception.Excecao;

public class Conexao {

	public Connection getConnection() throws Excecao {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		
		}
		DriverManager.setLoginTimeout(100);

		try {
			//return DriverManager.getConnection("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL", "OPS$RM75202", "041288");
			//USADO NA FIAP
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "OPS$RM75202", "041288");
			
		    /** Método para retorno do driver de conexao
		     * 
		     */
        		 
		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}

	}
}


