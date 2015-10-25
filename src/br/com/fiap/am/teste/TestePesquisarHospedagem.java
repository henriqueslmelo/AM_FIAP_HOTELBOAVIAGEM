package br.com.fiap.am.teste;

import java.util.List;

import br.com.fiap.am.beans.Hospedagem;
import br.com.fiap.am.dao.HospedagemDAO;
import br.com.fiap.am.exception.Excecao;

public class TestePesquisarHospedagem {

	public static void main(String[] args) throws Excecao {

		try {
			HospedagemDAO dao = new HospedagemDAO();
			List<Hospedagem> lista = dao.getLista();
			for (Hospedagem obj : lista) {
				System.out.println(obj.getDataEntrada() + "\n" + obj.getDataSaida()
						+ "\n" + obj.getDesconto()+ "\n");

			}
		} catch (Exception e) {
			throw new Excecao("Codigo da hospedagem invalido", e);
		}

	}

}
