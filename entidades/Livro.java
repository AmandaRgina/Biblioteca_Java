package br.com.biblioteca.entidades;

public class Livro extends Obras{
	

	public Livro(String nomeObra, String editoraObra, String anoPublicacao, String edicaoObra, String autorObra,
			String generoObra, int isbn) {
		super(nomeObra, editoraObra, anoPublicacao, edicaoObra, autorObra, generoObra);
		this.isbn = isbn;
	}

	private int isbn;
	
	

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
}
