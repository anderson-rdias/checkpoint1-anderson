package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="livros_1", sequenceName="SB_TB_LIVROS_1", allocationSize=1)
public class Livro implements Serializable {
	
	public Livro() {
		this.ativo = true;
		this.dataCadastro = LocalDateTime.now();
		this.dataAtualizacao = LocalDateTime.now();
	}
	
	public Livro(String titulo, String autor, String isbn, String edicao, LocalDate dataPublicacao) {
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicao = edicao;
		this.dataPublicacao = dataPublicacao;
	}
	
	private static final long serialVersionUID = 76949414925321165L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="livros_1")
	private Long id;
	
	@Column(name="nm_titulo", length = 80)
	private String titulo;
	
	@Column(name="nm_autor", length = 80)
	private String autor;
	
	@Column(name="nr_isbn", length = 17, unique = true)
	private String isbn;
	
	@Column(name="nm_edicao", length = 80)
	private String edicao;
	
	@Column(name="dt_publicacao", nullable=false)
	private LocalDate dataPublicacao;

	@Column(name="st_ativo")
	private Boolean ativo;
	
	@Column(name="dt_cadastro", nullable = false)
	private LocalDateTime dataCadastro;
	
	@Column(name="dt_atualizacao", nullable = false)
	private LocalDateTime dataAtualizacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	@Override
	public String toString() {
		return "T?tulo: : " + getTitulo()
		+ "\nAutor: " + getAutor()
		+ "\nISBN: " + getIsbn()
		+ "\nEdi??o: " + getEdicao()
		+ "\nData Publica??o: " + getDataPublicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	
}