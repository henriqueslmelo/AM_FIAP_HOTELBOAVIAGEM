package br.com.fiap.am.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.am.beans.Funcionario;
import br.com.fiap.am.bo.AcessoInternoBO;
import br.com.fiap.am.exception.Excecao;

/**
 * Servlet implementation class ServletAcessoInterno
 */
@WebServlet(name = "Servlet", urlPatterns = { "/Servlet" })
public class ServletAcessoInterno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAcessoInterno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Funcionario funcionario = new Funcionario();
	
		int id= (Integer.parseInt(request.getParameter("codigo")));
		System.out.println(funcionario.getCodigoFuncionario());
		
		AcessoInternoBO ac = new AcessoInternoBO();
		boolean result = false;
		try {
			result = ac.pesquisaFuncionario(id);
		} catch (Excecao e) {
			e.printStackTrace();
		}
		
		
		if (result == true) {
			request.getRequestDispatcher("Consumo.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("AcessoInterno.jsp").forward(request, response);
		}
	}
	}


