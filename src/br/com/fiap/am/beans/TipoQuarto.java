package br.com.fiap.am.beans;

public class TipoQuarto {
	private int codigoTipoQuarto;
	private String descricao;

	public TipoQuarto() {
		super();
	}

	public TipoQuarto(int codigoTipoQuarto, String descricao) {
		super();
		this.codigoTipoQuarto = codigoTipoQuarto;
		this.descricao = descricao;
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

	public TipoQuarto(String descricao) {
		super();
		this.descricao = descricao;
	}
	
}
