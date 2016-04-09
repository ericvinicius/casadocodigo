package org.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.models.Book;

public class BookDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Book book) {
		manager.persist(book);	
	}

}
