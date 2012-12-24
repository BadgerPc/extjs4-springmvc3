package br.com.alexandre.repository;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Book;

public class BookRepository extends HibernateDaoSupport {
	@Transactional
	public Book read(final Long id) {
		return getHibernateTemplate().get(Book.class, id);
	}
}
