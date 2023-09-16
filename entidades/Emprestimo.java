package br.com.biblioteca.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Emprestimo {
	
	private Long id;
	private Obra obra;
	private Usuario usuario;
	private LocalDate data;
	private static Long PROXIMOID = 1l;
	
	
	public Emprestimo(Obra obra, Usuario usuario, LocalDate data) {
		
		this.id = PROXIMOID;
		this.obra = obra;
		this.usuario = usuario;
		this.data = data;
		
		PROXIMOID++;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Obra getObra() {
		return obra;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", obra=" + obra + ", usuario=" + usuario + ", data=" + data + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
