package br.com.alexandre.repository;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Author;

public class AuthorRepository extends HibernateDaoSupport {

	@Transactional
	public Author read(final Long id) {
		return getHibernateTemplate().get(Author.class, id);
	}
}
