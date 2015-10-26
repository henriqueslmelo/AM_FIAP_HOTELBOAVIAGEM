package br.com.fiap.am.exception;


/**
 * Classe para criação das excecoes
 * 
 * Retorta uma String com a excecao a ser exibida

 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */


public class Excecao extends Exception {
	public Excecao(String m, Exception e) {
		super(m, e);
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Número Inválido");
		} else if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Divisão por 0");
		} else if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			System.out.println("Campo vazio");
		} else if (e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")) {
			System.out.println("Tamanho do Array inválido");
		} else if (e.getClass().toString().equals("class java.lang.IllegalArgumentException")) {
			System.out.println("Referência nula");
		} else if (e.getClass().toString().equals("class java.lang.ClassNotFoundException")) {
			System.out.println("Classe não localizada");
		} else if (e.getClass().toString().equals("class java.io.IOException")) {
			System.out.println("Falha na entrada/saída de dados");
		} else if (e.getClass().toString().equals("class java.sql.SQLException;")) {
			System.out.println("Falha na conexão");
		} else {
			e.printStackTrace();
		}
		
		
	}
	
}
