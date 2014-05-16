package asktechforum.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

import asktechforum.dominio.Pergunta;
import asktechforum.repositorio.CadastroPerguntasDAO;
import interfaces.CadastroPergunta;

public class CadastroPerguntaBC implements CadastroPergunta{
	
	private CadastroPerguntasDAO cadastro;
	
	public CadastroPerguntaBC(){
		CadastroPerguntasDAO cadastro = new CadastroPerguntasDAO();
	}

	@Override
	public void adcionarPergunta(Pergunta pergunta) throws SQLException {
		// TODO Auto-generated method stub
		if(pergunta.getData()==null){
			
		}else if(pergunta.getDescricao().isEmpty()){
			
		}else if(pergunta.getHora()==null){
			
		}else if(pergunta.getTitulo().isEmpty()){
			
		}else if(pergunta.getUsuario()==0){
			
		}else{
			cadastro.adcionarPergunta(pergunta);
		}
		
	}

	@Override
	public void adcionarTag(int pergunta, int tag) throws SQLException {
		// TODO Auto-generated method stub
		if(pergunta==0){
			
		}else if(tag==0){
			
		}else{
			cadastro.adcionarTag(pergunta, tag);
		}
			
	}

	@Override
	public void removerTag(int pergunta, int tag) throws SQLException {
		// TODO Auto-generated method stub
		if(pergunta==0){
			
		}else if(tag==0){
			
		}else{
			cadastro.removerTag(pergunta, tag);
		}
	}

	@Override
	public void deletarPergunta(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pergunta consultarPerguntaPorIdPergunta(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Pergunta> consultarPerguntaIdUsuario(int id)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Pergunta> consultarTodasPerguntas() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Pergunta> consultarPerguntaPorTag(int id)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
