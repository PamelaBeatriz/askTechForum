package asktechforum.dominio;

public class Tag {
	private int idTag;
	private String nome;
	
	public Tag() {
	}
	
	//GETTERS AND SETTERS
	public int getIdTag() {
		return idTag;
	}
	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}