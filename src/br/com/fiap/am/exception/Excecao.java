package br.com.fiap.am.exception;


/**
 * Classe para cria��o das excecoes
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
			System.out.println("N�mero Inv�lido");
		} else if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			System.out.println("Divis�o por 0");
		} else if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			System.out.println("Campo vazio");
		} else if (e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")) {
			System.out.println("Tamanho do Array inv�lido");
		} else if (e.getClass().toString().equals("class java.lang.IllegalArgumentException")) {
			System.out.println("Refer�ncia nula");
		} else if (e.getClass().toString().equals("class java.lang.ClassNotFoundException")) {
			System.out.println("Classe n�o localizada");
		} else if (e.getClass().toString().equals("class java.io.IOException")) {
			System.out.println("Falha na entrada/sa�da de dados");
		} else if (e.getClass().toString().equals("class java.sql.SQLException;")) {
			System.out.println("Falha na conex�o");
		} else {
			e.printStackTrace();
		}
		
		
	}
	
}
