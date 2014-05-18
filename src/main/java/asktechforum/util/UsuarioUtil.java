package asktechforum.util;

import java.util.List;

import asktechforum.dominio.Usuario;
import asktechforum.repositorio.CadastroUsuarioDAO;

public class UsuarioUtil {
	
	public UsuarioUtil() {
	}
	
	public List<Usuario> ajustarIdUsuario(List<Usuario> usuarios) {
		CadastroUsuarioDAO usuarioDAO = new CadastroUsuarioDAO();
        for(int i = 1; i <= usuarios.size(); i++) {
        	usuarioDAO.atualizarIdUsuario(usuarios, i);
			usuarios.get(i-1).setIdUsuario(i);
        }
		return usuarios;
	}
}