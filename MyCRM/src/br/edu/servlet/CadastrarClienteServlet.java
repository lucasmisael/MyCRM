package br.edu.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.model.Cliente;
import br.edu.service.ClienteService;

/**
 * Servlet implementation class CadastrarClienteServlet
 */
@WebServlet("/CadastrarClienteServlet")
public class CadastrarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CadastrarClienteServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cpf = request.getParameter("cpf");
		
		ClienteService cs = new ClienteService();
		cs.cadastrarCliente(nome, email, cpf);
		
		ArrayList lista = cs.listar();
		request.setAttribute("listaCliente", lista);
		
		//Redirecionar
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
