package asktechforum.repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import asktechforum.dominio.Pergunta;
import asktechforum.util.ConnectionUtil;
import asktechforum.util.Util;

public class CadastroPerguntasDAO {
	
	private Connection con;
	private Util util;
	
	public CadastroPerguntasDAO(){
		con = ConnectionUtil.getConnection();
		util = new Util();
	}
	
	public void adcionarPergunta(Pergunta pergunta) throws SQLException{
		
		String sql = "insert into PERGUNTA(titulo, data, hora, descricao, idUsuario)values(?,?,?,?,?)";	
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sql);
			int index = 0;
			stmt.setString(++index, pergunta.getTitulo());
			stmt.setDate(++index, pergunta.getData());
			stmt.setDate(++index, pergunta.getHora());
			stmt.setString(++index,  pergunta.getDescricao());
			stmt.setInt(++index, pergunta.getUsuario());
			
			stmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stmt.close();
			con.close();
		}
		
		
	}
	
	public void deletarPergunta(int id) throws SQLException{
		
		String sql = "delete from PERGUNTA where idPergunta = " + id; 
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			stmt.close();
			con.close();
		}
		
	}
	
	public Pergunta  consultarPerguntaPorIdPergunta(int id) throws SQLException{
		Pergunta pergunta = new Pergunta();
		
		String sql = "select * from PERGUNTA where idPergunta = " + id;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.prepareStatement(sql);
			rs  = stmt.executeQuery();
			while(rs.next()){
				pergunta.setDescricao(rs.getString("descricao"));
				pergunta.setIdPergunta(rs.getInt("idPergunta"));
				pergunta.setTitulo(rs.getString("titulo"));
				pergunta.setUsuario(rs.getInt("idUsuario"));
				pergunta.setData(rs.getDate("data"));
				pergunta.setHora(rs.getDate("hora"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rs.close();
			stmt.close();
			con.close();
		}
		
		return pergunta;
	}
	
	public ArrayList<Pergunta> consultarPerguntaIdUsuario(int id) throws SQLException{
		ArrayList<Pergunta> pergunta = new ArrayList<Pergunta>();
		
		String sql = "select * from PERGUNTA where idUsuario = " + id;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			
			rs  = stmt.executeQuery();
			
			while(rs.next()){
				Pergunta p = new Pergunta();
				p.setDescricao(rs.getString("descricao"));
				p.setIdPergunta(rs.getInt("idPergunta"));
				p.setTitulo(rs.getString("titulo"));
				p.setUsuario(rs.getInt("usuario"));
				p.setData(rs.getDate("data"));
				p.setHora(rs.getDate("hora"));
				pergunta.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rs.close();
			stmt.close();
			con.close();
		}
		
		return pergunta;
	}
	
	public ArrayList<Pergunta> consultarTodasPerguntas() throws SQLException{
		ArrayList<Pergunta> pergunta = new ArrayList<Pergunta>();
		
		String sql = "select * from PERGUNTA";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Pergunta p = new Pergunta();
				p.setDescricao(rs.getString("descricao"));
				p.setIdPergunta(rs.getInt("idPergunta"));
				p.setTitulo(rs.getString("titulo"));
				p.setUsuario(rs.getInt("usuario"));
				p.setData(rs.getDate("data"));
				p.setHora(rs.getDate("hora"));
				pergunta.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rs.close();
			stmt.close();
			con.close();
		}
		
		return pergunta;
	}
	
	public ArrayList<Pergunta> consultarPerguntaPorTag(int id) throws SQLException{
		ArrayList<Pergunta> pergunta = new ArrayList<Pergunta>();
		
		String sql = "select p.idPergunta,"
				+ " p.titulo, p.descricao, p.idUsuario, "
				+ " p.data, p.hora "
				+ " from PERGUNTA p, TAG t, TAG_PERGUNTA tp"
				+ " where p.idPergunta = tp.idPergunta "
				+ " and tp.idTag = t.idTag"
				+ " and t.idTag =  " + id;
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Pergunta p = new Pergunta();
				p.setDescricao(rs.getString("descricao"));
				p.setIdPergunta(rs.getInt("idPergunta"));
				p.setTitulo(rs.getString("titulo"));
				p.setUsuario(rs.getInt("usuario"));
				p.setData(rs.getDate("data"));
				p.setHora(rs.getDate("hora"));
				pergunta.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			rs.close();
			stmt.close();
			con.close();
		}
		
		return pergunta;
	}
	
	public ArrayList<Pergunta> consultarPerguntaPorData(Date data){
		ArrayList<Pergunta> pergunta = new ArrayList<Pergunta>();
		
		String sql = "select * from PERGUNTA where idUsuario = " + data ;
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Pergunta p = new Pergunta();
				p.setDescricao(rs.getString("descricao"));
				p.setIdPergunta(rs.getInt("idPergunta"));
				p.setTitulo(rs.getString("titulo"));
				p.setUsuario(rs.getInt("usuario"));
				p.setData(rs.getDate("data"));
				p.setHora(rs.getDate("hora"));
				pergunta.add(p);
			}
			
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pergunta;
	}
	
	

}

