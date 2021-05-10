package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/conect")
public class ServletConect<nUsuarios> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<nUsuarios> ListUser;

	public ServletConect() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("iUsuario");
		String senha = request.getParameter("iSenha");

		ListUser = nUsuarioDAO.TodosUsuarios();

		for (nUsuarios user : ListUser) {
			if (user.getEmail().equals(login) && user.getSenha().equals(senha)) {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("Cadastro.jsp");
				requestdispatcher.forward(request, response);
			}
		}

	}

}
