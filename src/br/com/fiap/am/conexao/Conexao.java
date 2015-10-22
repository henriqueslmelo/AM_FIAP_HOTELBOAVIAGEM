package br.com.fiap.am.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "OPS$RM71962", "140486");   
			// USADO REMOTO

		} catch (Exception e) {
			throw new Excecao("Ocorreu um erro", e);
		}

	}
}
