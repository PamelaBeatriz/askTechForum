package asktechforum.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

import asktechforum.dominio.Tag;
import asktechforum.repositorio.CadastroTagDAO;

public class CadastroTagBC {
	
	private CadastroTagDAO cadastro;
	
	public CadastroTagBC(){
		 cadastro = new CadastroTagDAO();
	}
	
	public void adcionarTag(Tag tag) throws SQLException{
		if(tag.getNome().isEmpty()){
			
		}else{
			
			cadastro.adcionarTag(tag);
		}
	}
	
	public void deletarTag(int id) throws SQLException{
		if(id==0){
			
		}else{
			cadastro.deletarTag(id);
		}
	}
	
	public Tag consultarTagId(int id) throws SQLException{
		Tag tag = new Tag();
		if(id==0){
			
		}else{
			tag = cadastro.consultarTagId(id);
		}
		
		return tag;
	}
	
	public ArrayList<Tag> consultarTagPorNome(String nome) throws SQLException{
		
		ArrayList<Tag> tag = new ArrayList<Tag>();
		
		if(nome.isEmpty()){
			
		}else{
			CadastroTagDAO cadastro = new CadastroTagDAO();
			tag = cadastro.consultarTagPorNome(nome);
		}
		
		return tag;
		
		
	}
	
	public ArrayList<Tag> consultarTodasTag() throws SQLException{
		ArrayList<Tag> tag = new ArrayList<Tag>();
		tag = cadastro.consultarTodasTag();
		return tag;
	}

}
