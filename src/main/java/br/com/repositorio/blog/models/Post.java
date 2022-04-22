package br.com.repositorio.blog.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String titulo;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@NotNull
	private List<Usuario> autor;
	
	@Lob
	@NotBlank
	private String conteudo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataPublicacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Usuario> getAutor() {
		return autor;
	}

	public void setAutor(List<Usuario> autor) {
		this.autor = autor;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public Post() {}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", conteudo=" + conteudo
				+ ", dataPublicacao=" + dataPublicacao + "]";
	}

}
