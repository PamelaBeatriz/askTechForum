package asktechforum.util;

import java.util.List;

import asktechforum.dominio.Usuario;
import asktechforum.repositorio.UsuarioDAO;

public class UsuarioUtil {
	
	public UsuarioUtil() {
	}
	
	public List<Usuario> ajustarIdUsuario(List<Usuario> usuarios) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
        for(int i = 1; i <= usuarios.size(); i++) {
        	usuarioDAO.atualizarIdUsuario(usuarios, i);
			usuarios.get(i-1).setIdUsuario(i);
        }
		return usuarios;
	}
}