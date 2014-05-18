package asktechforum.util;

import java.util.List;
import java.util.Random;

import asktechforum.dominio.Usuario;
import asktechforum.repositorio.UsuarioDAO;

public class UsuarioUtil {
	
	public UsuarioUtil() {
	}
	
	public List<Usuario> ajustarIdUsuario(List<Usuario> usuarios) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		int[] numeroRandom = new int[usuarios.size()];
        Random gerador = new Random();
        boolean aux = false;

        while(!aux) {
	        for(int i = 1; i <= usuarios.size(); i++) {
	        	numeroRandom[i-1] = gerador.nextInt();
	        	if (numeroRandom[i-1] < 0) {
	        		numeroRandom[i-1] = numeroRandom[i-1] * (-1);  
	        	} 
	        	if(compararIdUsuario(numeroRandom[i-1], usuarios)) {
	        		i = i - 1;
	        	}
	        }
	        aux = true;
        }
        
        for(int i = 1; i <= usuarios.size(); i++) {
        	usuarioDAO.atualizarIdUsuario(usuarios, i-1, numeroRandom[i-1]);
			usuarios.get(i-1).setIdUsuario(numeroRandom[i-1]);
        }

        for(int i = 1; i <= usuarios.size(); i++) {
        	usuarioDAO.atualizarIdUsuario(usuarios, i-1, i);
			usuarios.get(i-1).setIdUsuario(i);
        }
        
		return usuarios;
	}
	
	public boolean compararIdUsuario(int numero, List<Usuario> usuarios) {
		boolean aux = false;
		for(int i = 1; i <= usuarios.size(); i++) {
			if(numero == usuarios.get(i-1).getIdUsuario()) {
				aux = true;
			}
        }
		return aux;
	}
}