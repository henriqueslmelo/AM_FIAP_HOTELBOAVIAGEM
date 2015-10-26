package br.com.fiap.am.teste;

import javax.swing.JOptionPane;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.Reserva;
import br.com.fiap.am.beans.ReservaQuarto;
import br.com.fiap.am.dao.ReservaDAO;
import br.com.fiap.am.exception.Excecao;

public class TesteInlcuirReserva {
	
	public static void main(String[] args) throws Excecao{

		 Reserva reserva = new Reserva();
		 reserva.setDtSolicitação(JOptionPane.showInputDialog("Digite a data de solicitação:"));
		 reserva.setDtEntrada(JOptionPane.showInputDialog("Digite a data de enntrada: "));
		 reserva.setDtSaida(JOptionPane.showInputDialog("Digite a data de saida"));
		 reserva.setQtdeHospedesAdultos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de hospedes adultos: ")));
		 reserva.setQtdeHospedesCriancas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de hospedes crinaças")));
		 
		 Cliente cl = new Cliente();
		 cl.setCodigoCliente(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente")));
		 
		 ReservaQuarto rq = new ReservaQuarto();
		 rq.setNrQuarto(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto")));;
         
		 reserva.setCliente(cl);
		 reserva.setReservaQuarto(rq);
		 
		 ReservaDAO dao = new ReservaDAO();
		 try {
			dao.inserir(reserva);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println("Gravado!");

	}


}
