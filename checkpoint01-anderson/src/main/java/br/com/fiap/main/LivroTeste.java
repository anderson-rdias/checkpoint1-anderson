package br.com.fiap.main;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.entity.Livro;
import br.com.fiap.jpa.service.impl.LivroServiceImpl;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		Livro livro1 = new Livro ("Harry Potter e a Pedra Filosofal", "Anderson", "9780807286005", "Edi??o 1", LocalDate.of(1997, 6, 26));
		Livro livro2 = new Livro("Harry Potter e o C?lice de Fogo", "Rodrigues Dias", "9788893819930", "Edi??o 2", LocalDate.of(2000, 7, 8));
		Livro livro3 = new Livro("O Mochileiro das Gal?xias", "Douglas Adams", "9781405053976", "Edi??o 3", LocalDate.of(1972, 10, 12));
		
		livroService.inserir(livro1);
		livroService.inserir(livro2);
		livroService.inserir(livro3);
			
		List<Livro> livros = livroService.listar();
		
		for (Livro item : livros) {
			System.out.println(item);
		}
		
		livroService.remover(3L);
		
		livro2.setEdicao("3");
		livroService.atualizar(livro2);
	}

}
