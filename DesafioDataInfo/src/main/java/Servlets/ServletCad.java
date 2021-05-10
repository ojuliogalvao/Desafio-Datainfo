package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ListaDeUsuarios.UsuarioDAO;


/**
 * Servlet implementation class ServletCadastro
 */
@WebServlet("/ServletCadastro")
public class ServletCad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private nUsuarios user;
    private nUsuarioDAO usuarioDAO;

    public void init() {
        UsuarioDAO = new nUsuarioDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/insert":
                    inserirusuario(request, response);
                    break;
                case "/delete":
                    deletarusuario(request, response);
                    break;
                case "/update":
                    alterarusuario(request, response);
                    break;
                default:
                    consultarusuario(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void consultarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        List < nUsuarios > listUser = UsuarioDAO.TodosUsuarios();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cadastro.jsp");
        dispatcher.forward(request, response);
    }


    private void inserirusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        nUsuarios newUser = new nUsuarios(name, email, senha);
        UsuarioDAO.inserir(newUser);
        response.sendRedirect("list");
    }

    private void alterarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("name");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        nUsuarios book = new nUsuarios(nome,email,senha);
        UsuarioDAO.alterar(book);
        response.sendRedirect("list");
    }

    private void deletarusuario(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        UsuarioDAO.deletar(id);
        response.sendRedirect("list");

    }
}