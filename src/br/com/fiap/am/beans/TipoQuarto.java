package br.com.fiap.am.beans;

/**
 * Classe para objetos do tipo TipoQuarto, onde serão contidos, valores e métodos para o mesmo
 * 
 * 
 * 
 * @author Bruno Abdante
 * @author Henrique Melo
 * @author Monica Silva
 *
 */

public class TipoQuarto {
	private int codigoTipoQuarto;
	private String descricao;
	private double vlQuarto;
	public TipoQuarto() {
		super();
	}
	public TipoQuarto(String descricao, double vlQuarto) {
		super();
		this.descricao = descricao;
		this.vlQuarto = vlQuarto;
	}
	public TipoQuarto(int codigoTipoQuarto, String descricao, double vlQuarto) {
		super();
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.descricao = descricao;
		this.vlQuarto = vlQuarto;
	}
	public int getCodigoTipoQuarto() {
		return codigoTipoQuarto;
	}
	public void setCodigoTipoQuarto(int codigoTipoQuarto) {
		this.codigoTipoQuarto = codigoTipoQuarto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getVlQuarto() {
		return vlQuarto;
	}
	public void setVlQuarto(double vlQuarto) {
		this.vlQuarto = vlQuarto;
	}
	
	
	
}
