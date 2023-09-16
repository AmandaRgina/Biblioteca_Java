package br.com.biblioteca.entidades;

public class Livro extends Obra{
	
	
	private String isbn;
	private String autor;
	
	
	public Livro(Long id, String nome, String editora, int anoPublicacao, int edicao, String genero, String isbn, String autor) {
		super(id, nome, editora, anoPublicacao, edicao, genero);
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	@Override
	public String toString() {
		return " [nome=" + nome + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", edicao="
				+ edicao + ", genero=" + genero + ", isbn=" + isbn + ", autor=" + autor + "]";
	}
	
	
	
}
