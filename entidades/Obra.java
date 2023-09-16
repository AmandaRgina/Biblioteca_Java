package br.com.biblioteca.entidades;

public abstract class Obra {

	protected  Long id;
	protected  String nome;
	protected  String editora;
	protected  int anoPublicacao;
	protected  int edicao;
	protected  String genero;
	
	
	
	
	public Obra(Long id, String nome, String editora, int anoPublicacao, int edicao, String genero) {
	
		this.id = id;
		this.nome = nome;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.edicao = edicao;
		this.genero = genero;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public int getEdicao() {
		return edicao;
	}
	
	
	public void setGenero(String genero) {
		
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}




	
	
}
