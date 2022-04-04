package br.com.fiap.jpa.dao.impl;

import br.com.fiap.entity.Livro;
import br.com.fiap.jpa.dao.HibernateGenericDAO;

public class LivroDAOImpl extends HibernateGenericDAO<Livro, Long>{
	
	private static LivroDAOImpl instance;

	public LivroDAOImpl() {
		super(Livro.class);
		// TODO Auto-generated constructor stub
	}
	
	public static LivroDAOImpl getInstance() {
		if (instance == null) {
			instance = new LivroDAOImpl();
		}
		
		return instance;
	}

}
