package br.com.fiap.am.teste;

import java.sql.Connection;

import br.com.fiap.am.conexao.Conexao;
import br.com.fiap.am.exception.Excecao;

public class TesteConexao {

	public static void main(String[] args) throws Excecao {
		Connection c = null;
		try {
			c = new Conexao().getConnection();
			System.out.println("Conexão Aberta");
		} catch (Exception e) {
			System.out.println("Erro de conexão");

		} finally {
			try {
				c.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
