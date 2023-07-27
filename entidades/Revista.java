package br.com.biblioteca.entidades;

public class Revista extends Obras{

	private int issn;
	
	
	public Revista(String nomeObra, String editoraObra, String anoPublicacao, String edicaoObra, String autorObra,
			String generoObra, int issn) {
		super(nomeObra, editoraObra, anoPublicacao, edicaoObra, autorObra, generoObra);
		this.issn = issn;
	}
	
	public Revista() {
		
	}

	public int getIssn() {
		return issn;
	}

	public void setIssn(int issn) {
		this.issn = issn;
	}
	
	
}
