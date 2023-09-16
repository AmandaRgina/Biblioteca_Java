package br.com.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.biblioteca.entidades.Emprestimo;
import br.com.biblioteca.entidades.Livro;
import br.com.biblioteca.entidades.Obra;
import br.com.biblioteca.entidades.Revista;
import br.com.biblioteca.entidades.Usuario;

public class Biblioteca {
	
	private ArrayList<Livro> livros;
	private ArrayList<Revista> revistas;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Emprestimo> emprestimos;
	
	public Biblioteca() {
		
		this.livros = new ArrayList<Livro>();
		this.revistas = new ArrayList<Revista>();
		this.usuarios = new ArrayList<Usuario>();
		this.emprestimos = new ArrayList<Emprestimo>();
	}

	public boolean addLivro(Livro livro) {
		return livros.add(livro);
	}

	public boolean addRevista(Revista revista) {
		return revistas.add(revista);
	}
	
	public boolean add(Usuario usuario) {
		return usuarios.add(usuario);
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public ArrayList<Revista> getRevistas() {
		return revistas;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public ArrayList<Emprestimo> getEmprestimos(){
		return emprestimos;
	}
	
	public void imprimeLivros(ArrayList<Livro> listaLivros) {
		
		ArrayList<Livro> lista = (listaLivros != null) ? listaLivros : livros;
		
		for (int i = 1; i <= lista.size(); i++) {
			
			System.out.println("Livro " + i + livros.get(i-1));
			
		}
		
	}
	
	public void imprimeUsuarios(ArrayList<Usuario> listaUsuarios) {
		
		ArrayList<Usuario> lista = (listaUsuarios != null) ? listaUsuarios : usuarios;
		
		for (int i = 1; i <= lista.size(); i++) {
			
			System.out.println("Usuario " + i + usuarios.get(i-1));
			
		}
		
	}
	
	public void imprimeRevistas(ArrayList<Revista> listaRevistas) {
		
		ArrayList<Revista> lista = (listaRevistas != null) ? listaRevistas : revistas;
		
		for (int i = 1; i <= lista.size(); i++) {
			
			System.out.println("Revista " + i + revistas.get(i-1));
			
		}
		
	}
	
	public void imprimeEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
		
		ArrayList<Emprestimo> lista = (listaEmprestimos != null) ? listaEmprestimos : emprestimos;
		
		for (int i = 1; i <= lista.size(); i++) {
			
			System.out.println("Emprestimo " + i + emprestimos.get(i-1));
			
		}
		
	}
	
	
	public ArrayList<Livro> pesquisaLivros(String titulo){
		
		ArrayList<Livro> buscaPorTitulo = new ArrayList<Livro>();
		
		for (Livro livro : livros) {
			
			if (livro.getNome().equalsIgnoreCase(titulo)) {
				
				buscaPorTitulo.add(livro);
			}
		}
		
		return buscaPorTitulo;
		
	}

	
	public ArrayList<Revista> pesquisaRevista(String titulo){
		
		ArrayList<Revista> buscaPorTitulo = new ArrayList<Revista>();
		
		for (Revista revista : revistas) {
			
			if (revista.getNome().contains(titulo)) {
				
				buscaPorTitulo.add(revista);
			}
		}
		
		return buscaPorTitulo;
		
	}
	
	
	public ArrayList<Usuario> pesquisaUsuario(String email){
		
		ArrayList<Usuario> buscaPorEmail = new ArrayList<Usuario>();
		
		for (Usuario usuario: usuarios) {
			
			if (usuario.getEmail().equalsIgnoreCase(email)) {
				
				buscaPorEmail.add(usuario);
			}
		}
		
		return buscaPorEmail;
	}
	

	public String emprestar(Long id, String cpf) {
		
		
		if(id == null) {
			
			return "O id da obra não foi informado";
			
		}
		
		if(cpf == null || cpf.isBlank()) {
			
			return "O cpf não foi informado";
		}
		
		Obra obra = buscaObraPorId(id);
		
		if(obra == null) {
			
			return "Não existe uma obra com o id informado";
		}
		
		Usuario usuario = buscaUsuarioPorCpf(cpf);
		
		if(usuario == null) {
			
			return "Não existe um usuario com o cpf informado";
		}
		
		if(obraEmprestada(id)) {
			
			return "Obra emprestada";
		}
		
		Emprestimo emprestimo = new Emprestimo(obra, usuario, LocalDate.now());
		
		this.emprestimos.add(emprestimo);
		
		return String.format("O emprestimo foi criado com sucesso. O Id do emprestimo é: %d", emprestimo.getId());
	}
	
	
	public Boolean obraEmprestada(Long idObra) {
		
		for(Emprestimo emprestimo: emprestimos) {
			
			if(emprestimo.getObra().getId().equals(idObra)) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public Obra buscaObraPorId(Long id){
		
		for (Livro livro : livros) {
			
			if (livro.getId().equals(id)) {
				
				return livro;
			}
			
		}
		
		for (Revista revista : revistas) {
			
			if (revista.getId().equals(id)) {
				
				return revista;
			}
			
		}
		
		
		return null;
		
	}
	
	public Usuario buscaUsuarioPorCpf(String cpf){
		
		for (Usuario usuario : usuarios) {
			
			if (usuario.getCpf().equals(cpf)) {
				
				return usuario;
			}
			
		}
		
		return null;
		
	}

	public String devolver(Long idObra) {
		
		for(Emprestimo emprestimo: emprestimos) {
			
			if(emprestimo.getObra().getId().equals(idObra)) {
				
				emprestimos.remove(emprestimo);
			
				return "Obra devolvida com sucesso";
				
			}
		}
		
		return "Obra não emprestada";
	}
	
	
	
}

	
	