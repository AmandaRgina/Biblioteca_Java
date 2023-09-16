package br.com.biblioteca.entidades;

public class Usuario {
	
	private String nome;
	private String cpf;
	private String email;
	
	
	public Usuario(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public Usuario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " [nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	
}
