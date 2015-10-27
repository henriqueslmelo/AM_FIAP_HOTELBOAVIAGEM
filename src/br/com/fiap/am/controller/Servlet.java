package br.com.fiap.am.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.am.beans.Cliente;
import br.com.fiap.am.bo.LoginBO;
import br.com.fiap.am.exception.Excecao;

/**
 * Servlet implementation class Login
 */
@WebServlet(name="Servlet", 
urlPatterns={"/Servlet"})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("doPost");
		LoginBO login = new LoginBO();	
		List<Cliente> result = null;
		try {
			result = login.getLogin(request.getParameter("user"), request.getParameter("password"));
		} catch (Excecao e) {
			e.printStackTrace();
		}

		if (result.isEmpty()) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
