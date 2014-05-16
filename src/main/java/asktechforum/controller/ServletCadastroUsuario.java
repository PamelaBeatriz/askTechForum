package asktechforum.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import asktechforum.dominio.Usuario;
import asktechforum.repositorio.UsuarioDAO;

/**
 * Implementação do Servlet de Cadastro de Usuario.
 */
@WebServlet("/ServletCadastroUsuario")
public class ServletCadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String SUCCESS = "/cadastroUsuarioSucesso.jsp";
    //private static String ERROR = "/cadastroUsuario.jsp";
	
    private UsuarioDAO dao;
       
    /**
     * Construtor do Servlet de Cadastro de Usuario.
     */
    public ServletCadastroUsuario() {
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
	 * Implementacao do metodo doPost() Servlet de Cadastro de Usuario.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setDataNascimento(request.getParameter("dataNascimento"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setLocalizacao(request.getParameter("localizacao"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setConfSenha(request.getParameter("confsenha"));
		
		dao.adicionarUsuario(usuario);
		
		RequestDispatcher view = request.getRequestDispatcher(SUCCESS);
		request.setAttribute("usuario", usuario);
        view.forward(request, response);
	}
}
