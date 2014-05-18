package asktechforum.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import asktechforum.util.ConnectionUtil;
import asktechforum.util.UsuarioUtil;
import asktechforum.dominio.Usuario;

public class CadastroUsuarioDAO {
	private Connection connection;
	
	public CadastroUsuarioDAO(){
		connection = ConnectionUtil.getConnection();
	}
	
	public void adicionarUsuario(Usuario usuario){
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into usuario(nome,dt_nasc,email,localizacao,senha) values ( ?, ?, ?, ?, ? )");
            
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setDate(2, usuario.getDataNascimento());
            preparedStatement.setString(3, usuario.getEmail());
            preparedStatement.setString(4, usuario.getLocalizacao());
            preparedStatement.setString(5, usuario.getSenha());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void deletarUsuario(String email) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from usuario where email=?");
            
            preparedStatement.setString(1, email);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
		
	public Usuario consultarUsuarioPorEmail(String email) {
		Usuario usuario = new Usuario();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from usuario where email=?");
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setDataNascimento(rs.getDate("dt_nasc"));
				usuario.setEmail(rs.getString("email"));
				usuario.setLocalizacao(rs.getString("localizacao"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}	
	
	public Usuario consultarUsuarioPorNome(String nome) {
		Usuario usuario = new Usuario();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from usuario where nome=?");
			preparedStatement.setString(1, nome);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setDataNascimento(rs.getDate("dt_nasc"));
				usuario.setEmail(rs.getString("email"));
				usuario.setLocalizacao(rs.getString("localizacao"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}	
	
	public void atualizarIdUsuario(List<Usuario> usuarios, int index) {
        	int idUsuario = usuarios.get(index-1).getIdUsuario();
        	PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement("update usuario set idUsuario=? where idUsuario=?;");
	            preparedStatement.setInt(1, index);
	            preparedStatement.setInt(2, idUsuario);
	            preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public List<Usuario> consultarTodosUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        UsuarioUtil usuarioUtil = new UsuarioUtil();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from usuario;");
            while (rs.next()) {
            	Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setDataNascimento(rs.getDate("dt_nasc"));
				usuario.setEmail(rs.getString("email"));
				usuario.setLocalizacao(rs.getString("localizacao"));
            	usuarios.add(usuario);
            }
            usuarios = usuarioUtil.ajustarIdUsuario(usuarios);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}