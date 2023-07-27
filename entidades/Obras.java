package br.com.biblioteca.entidades;

public abstract class Obras {

	private String nomeObra;
	private String editoraObra;
	private String anoPublicacao;
	private String edicaoObra;
	private String autorObra;
	private String generoObra;
	
	public Obras(String nomeObra, String editoraObra, String anoPublicacao, String edicaoObra,
				 String autorObra, String generoObra) {
		
		this.nomeObra = nomeObra;
		this.editoraObra = editoraObra;
		this.edicaoObra = edicaoObra;
		this.anoPublicacao = anoPublicacao;
		this.autorObra = autorObra;	
		this.generoObra = generoObra;
	}
	
	public Obras() {
		
	}
	
	public void setNomeObra(String nomeObra) {
		this.nomeObra = nomeObra;
	}
	
	public String getNomeObra() {
		return nomeObra;
	}
	
	public void setEditoraObra(String editoraObra) {
		this.editoraObra = editoraObra;
	}
	
	public String getEditoraObra() {
		return editoraObra;
	}
	
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setEdicaoObra(String edicaoObra) {
		this.edicaoObra = edicaoObra;
	}
	
	public String getEdicaoObra() {
		return edicaoObra;
	}
	
	public void setAutorObra(String autorObra) {
		this.autorObra = autorObra;
	}
	
	public String getAutorObra() {
		return autorObra;
	}
	
	public void setGeneroObra(String generoObra) {
		
		this.generoObra = generoObra;
	}
	
	public String getGeneroObra() {
		return generoObra;
	}
	
	
}
