package br.com.fiap.am.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.beans.TipoQuarto;
import br.com.fiap.am.bo.LoginBO;
import br.com.fiap.am.bo.TipoQuartoBO;
import br.com.fiap.am.exception.Excecao;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Servlet", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TipoQuarto  tipo = new TipoQuarto();
		TipoQuartoBO tipoBo = new TipoQuartoBO();
		tipo.setDescricao(request.getParameter("tipoQuarto"));
			request.setAttribute("tipoQuarto", tipoBo);
			request.getRequestDispatcher("reserva.jsp").forward(request, response);
			try {
				tipo = tipoBo.consultar(tipo);
				
			} catch (Excecao e) {
				e.printStackTrace();
			}
			request.setAttribute("tipo", tipo.getVlQuarto());
			double valor = tipo.getVlQuarto();
			String valorTexto = String.valueOf(valor);
			String destination = getInitParameter(valorTexto);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cliente cliente = new Cliente();
		
		
		
		
		cliente.setEmail(request.getParameter("user"));
		cliente.setDsSenha(request.getParameter("password"));
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getDsSenha());
		
		LoginBO login = new LoginBO();
		boolean result = false;
		try {
			result = login.getLogin(cliente);
		} catch (Excecao e) {
			e.printStackTrace();
		}
		
		System.out.println("BO");
		
		if (result == true) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

		
}
