package br.com.biblioteca.entidades;

public class Revista extends Obra{
	
	private int issn;

	
	public Revista(Long id, String nome, String editora, int anoPublicacao, int edicao, String genero, int issn) {
		super(id, nome, editora, anoPublicacao, edicao, genero);
		this.issn = issn;
	}

	

	public int getIssn() {
		return issn;
	}

	public void setIssn(int issn) {
		this.issn = issn;
	}

	@Override
	public String toString() {
		return "Revista [nome=" + nome + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", edicao="
				+ edicao + ", genero=" + genero + ", issn=" + issn + "]";
	}
	
	
	
	
}
