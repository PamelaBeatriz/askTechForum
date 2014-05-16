package asktechforum.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import asktechforum.dominio.Usuario;
import asktechforum.repositorio.UsuarioDAO;

/**
 * Implementação do Servlet de Pesquisa de Usuario.
 */
@WebServlet("/ServletPesquisaUsuario")
public class ServletPesquisaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String SUCCESS = "/pesquisarUsuario.jsp";
    
    private UsuarioDAO dao;
       
    /**
     * Construtor do Servlet de Pesquisa de Usuário.
     */
    public ServletPesquisaUsuario() {
        super();
        dao = new UsuarioDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * Implementacao do metodo doPost() Servlet de Pesquisa de Usuario.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		switch (request.getParameter("pesquisaRadio")) {
		case "nomeRadio":
			usuario = dao.consultarUsuarioPorNome(request.getParameter("nome"));
			listaUsuarios.add(usuario);
			break;
		case "emailRadio":
			usuario = dao.consultarUsuarioPorEmail(request.getParameter("email"));
			listaUsuarios.add(usuario);
			break;
		case "listartodosRadio":
			listaUsuarios.addAll(dao.consultarTodosUsuarios());
			break;
		default:
			break;
		}

		RequestDispatcher view = request.getRequestDispatcher(SUCCESS);
		request.setAttribute("usuarios", listaUsuarios);
        view.forward(request, response);
	}

}
